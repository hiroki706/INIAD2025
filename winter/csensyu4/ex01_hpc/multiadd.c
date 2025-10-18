#include <stdio.h>
#include <stdlib.h>
#include <stdint.h>
#include <pthread.h>

#define N 10000000000
#define THREADS 16

void* add_thread(void* arg)
{
    long long offset = (long long)(intptr_t)arg;
    long long total = 0;

    for (long long i = offset; i < N; i += THREADS) {
        total += i;
    }

    return (void*)(intptr_t)total;
}

int main()
{
    long long i;
    pthread_t tids[THREADS];
    long long total = 0;

    // スレッドを立ち上げる
    for (i = 0; i < THREADS; i++) {
        pthread_create(&tids[i], NULL, add_thread, (void*)(intptr_t)i);
    }
    // スレッドの終了を待ち合わせて、それぞれの合計値を合算する
    for (i = 0; i < THREADS; i++) {
        void* ret;
        pthread_join(tids[i], &ret);
        total += (long long)(intptr_t)ret;
    }
    
    printf("total = %lld\n", total);
    return 0;
}