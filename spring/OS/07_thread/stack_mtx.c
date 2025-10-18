// 課題2
// 課題1のプログラムを改変し、ミューテックスによる排他制御を追加せよ。
// 呼び出し側のコードは変更しないこと。（struct stack, init, push, popのみを変更すること）

// gcc -Wall -pthread stack_mtx.c -o stack_mtx.out && ./stack_mtx.out
#include <stdio.h>
#include <stdlib.h>
#include <pthread.h>
#include <unistd.h>
#include <time.h>

struct stack
{
    int buf[5024];
    int count;
    pthread_mutex_t mtx;
    pthread_cond_t cond; // 課題3: 要素数0のときのpopを、他のスレッドがpushするまで待機するように変更
};

void stack_init(struct stack *stk)
{
    stk->count = 0;
    pthread_mutex_init(&stk->mtx, NULL);
    pthread_cond_init(&stk->cond, NULL);
}

void stack_push(struct stack *stk, int val)
{
    pthread_mutex_lock(&stk->mtx);
    stk->buf[stk->count++] = val;
    pthread_cond_broadcast(&stk->cond);
    pthread_mutex_unlock(&stk->mtx);
}

int stack_pop(struct stack *stk)
{
    int res;
    pthread_mutex_lock(&stk->mtx);
    while (stk->count <= 0){
        pthread_cond_wait(&stk->cond, &stk->mtx);
    }
    res = stk->buf[--stk->count];
    pthread_mutex_unlock(&stk->mtx);
    return res;
}

void *thread_pop_func(void *arg)
{
    struct stack *stk = (struct stack *)arg;
    for (int i = 0; i < 5023; i++)
    {
        stack_pop(stk);
    }
    return NULL;
}
void *thread_push_func(void *arg)
{
    struct stack *stk = (struct stack *)arg;
    for (int i = 0; i < 5023; i++)
    {
        stack_push(stk, i);
    }
    return NULL;
}
int main(int argc, char *argv[])
{
    struct stack stk;

    stack_init(&stk);
    pthread_t threads[2];
    pthread_create(&threads[0], NULL, thread_pop_func, &stk);
    pthread_create(&threads[1], NULL, thread_push_func, &stk);

    pthread_join(threads[0], NULL);
    pthread_join(threads[1], NULL);

    printf("Final stack count: %d\n", stk.count);
    return 0;
}
