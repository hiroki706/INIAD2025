// stack.cはint型のスタックの実装となっている。
// 課題1
// このプログラムを改変し、2個以上のスレッドから同一のスタックに対して、push, popを同時に実行するようなプログラムを作成せよ。
//  - スタックの実装は変更しないこと。
//  - 例えば、2つのスレッドから以下のようなプログラムを実行するのでよい
// ```c
// for (int i = 0; i < 100; i++) {
//     stack_push(&stk, i);
//     printf("poped: %d\n", stack_pop(&stk));
// }
// ```
// 動作結果について、「複数のスレッドが同時に動作しているか？」「競合状態の問題は発生したか？」の観点から考察せよ。

// gcc -Wall -pthread stack.c -o stack.out && ./stack.out
#include <stdio.h>
#include <stdlib.h>
#include <pthread.h>
#include <unistd.h>
#include <time.h>

struct stack {
    int buf[128];
    int count;
};

void stack_init(struct stack* stk)
{
    stk->count = 0;
}

void stack_push(struct stack* stk, int val)
{
    stk->buf[stk->count++] = val;
}

int stack_pop(struct stack* stk)
{
    if (stk->count <= 0) {
        fprintf(stderr, "ERROR: stack is empty\n");
        abort();
    }

    return stk->buf[--stk->count];
}


void* thread_func(void* arg) {
    struct stack* stk = (struct stack*)arg;
    for (int i = 0; i < 100000; i++) {
        stack_push(stk, i);
        /** int poped_val = **/  stack_pop(stk);
        // printf("popped: %d\n", popped_value);
    }
    return NULL;
}
int main(int argc, char* argv[])
{
    struct stack stk;

    stack_init(&stk);
    pthread_t threads[2];
    pthread_create(&threads[0], NULL, thread_func, &stk);
    pthread_create(&threads[1], NULL, thread_func, &stk);

    pthread_join(threads[0], NULL);
    pthread_join(threads[1], NULL);

    printf("Final stack count: %d\n", stk.count);
    return 0;
}
