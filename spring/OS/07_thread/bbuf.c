// 課題4 bounded bufferの実装

#include <stdio.h>
#include <stdlib.h>
#include <pthread.h>
#include <unistd.h>
// bounded bufferとは、有限のサイズを持つバッファ
struct bbuf{
    char buf[8];
    int max_size;
    int head;
    int tail;
    pthread_mutex_t mtx;
    pthread_cond_t puted;
    pthread_cond_t geted;
};
int bb_init(struct bbuf *bb) {
    int res = 0;
    bb->head = 0;
    bb->tail = 0;
    bb->max_size = sizeof(bb->buf) / sizeof(bb->buf[0]);
    printf("bb_init: max_size = %d\n", bb->max_size);
    res = pthread_mutex_init(&bb->mtx, NULL);
    res = pthread_cond_init(&bb->puted, NULL);
    return res;
}
// バッファの先頭からデータを読み出し、得られたデータを返す
// バッファが空の場合は、データが入るまで待機する
char bb_get(struct bbuf *bb);
// バッファの末尾にデータcを追加する
// バッファが満杯の場合は、データが出るまで待機する
void bb_put(struct bbuf *bb, char c);

void* thread_get_func(void *arg)
{
    char* msgs = (char *)malloc(100 * sizeof(char));
    struct bbuf *bb = (struct bbuf *)arg;
    for (int i = 0; i < 100; i++) {
        msgs[i] = bb_get(bb);
    }
    return msgs;
}

void* thread_put_func(void *arg)
{
    struct bbuf *bb = (struct bbuf *)arg;
    for (int i = 0; i < 100; i++) {
        bb_put(bb, '0' + (i % 10)); // '0'から'9'までの文字を入れる
    }
    return NULL;
}

int main(int argc, char *argv[])
{
    struct bbuf bb;
    pthread_t threads[2];
    bb_init(&bb);

    pthread_create(&threads[0], NULL, thread_put_func, &bb);
    pthread_create(&threads[1], NULL, thread_get_func, &bb);
    char *msgs;
    pthread_join(threads[0], NULL);
    pthread_join(threads[1], (void **)&msgs);
    printf("Received messages: ");
    for (int i = 0; i < 100; i++) {
        printf("%c", msgs[i]);
    }
    printf("\n");
    free(msgs);

    return 0;
}

char bb_get(struct bbuf *bb)
{
    char res;

    pthread_mutex_lock(&bb->mtx);
    while (bb->head == bb->tail) {
        pthread_cond_wait(&bb->puted, &bb->mtx);
    }
    res = bb->buf[bb->head];
    bb->head = (bb->head+1) % bb->max_size;
    pthread_cond_broadcast(&bb->geted);
    pthread_mutex_unlock(&bb->mtx);

    return res;
}

void bb_put(struct bbuf *bb, char c)
{
    pthread_mutex_lock(&bb->mtx);
    while ((bb->tail + 1) % bb->max_size == bb->head) {
        pthread_cond_wait(&bb->geted, &bb->mtx);
    }
    bb->buf[bb->tail] = c;
    bb->tail = (bb->tail + 1) % bb->max_size;
    pthread_cond_broadcast(&bb->puted);
    pthread_mutex_unlock(&bb->mtx);
}
