#include <stdio.h>
#include <pthread.h>
#include <stdint.h>
#include <unistd.h>
#include <stdlib.h>

#define PHILOSOPHERS 5
#define DAYS 10000

static const char* names[] = {
    "Enryo", "Socrates", "Platon", "Aristoteles", "Kant"
};

pthread_t philosophers[PHILOSOPHERS];
pthread_mutex_t fork_mutex;
pthread_cond_t fork_cond;

int fork_count = 0;
typedef struct {
    int used_count;
    int is_picked[PHILOSOPHERS];
} Forks_t;
Forks_t forks;
static void eat(int phil, int fork1, int fork2)
{
    printf("%s: \"Yummy!\"\n", names[phil]);
}

void* philosopher_thread(void* arg)
{
    int phil = (int)(intptr_t)arg;
    unsigned int r = (phil << 16) + time(NULL);
    int left = phil;
    int right = (phil+1) % PHILOSOPHERS;
    int i;

    usleep(rand_r(&r) % 100000);

    for (i = 0; i < DAYS; i++) {
        /* Think for a while */
        usleep(rand_r(&r) % 1000);

        pthread_mutex_lock(&fork_mutex);
        /* Staring to eat */
        while (fork_count >= PHILOSOPHERS - 1) {
            printf("%s is waiting for forks\n", names[phil]);
            pthread_cond_wait(&fork_cond, &fork_mutex);
        }
        if (forks.is_picked[left])
            goto criticalerr;
        forks.is_picked[left] = 1;
        fork_count++;
        printf("%s picked up fork on the left\n", names[phil]);

        if(forks.is_picked[right])
            goto criticalerr;
        forks.is_picked[right] = 1;
        fork_count++;
        printf("%s picked up fork on the right, forkcount is %d\n", names[phil], fork_count);

        eat(phil, left, right);

        printf("%s returned fork on the right\n", names[phil]);
        printf("%s returned fork on the left\n", names[phil]);
        forks.is_picked[right] = 0;
        forks.is_picked[left] = 0;
        fork_count -= 2;
        pthread_cond_broadcast(&fork_cond);
        pthread_mutex_unlock(&fork_mutex);
    }

    return NULL;
    criticalerr: {
        fprintf(stderr, "   ERROR: Failed to pick up fork %d\n", right);
        abort();
    }
}


int main()
{
    int er, i;
    void* ret;

    er = pthread_mutex_init(&fork_mutex, NULL);
    if (er != 0) goto error;
    er = pthread_cond_init(&fork_cond, NULL);
    if (er != 0) goto error;

    for (i = 0; i < PHILOSOPHERS; i++) {
        er = pthread_create(&philosophers[i], NULL, philosopher_thread, (void*)(intptr_t)i);
        if (er != 0) goto error;
    }
    for (i = 0; i < PHILOSOPHERS; i++) {
        pthread_join(philosophers[i], &ret);
    }
    printf("finished\n");
    return 0;

 error:
    fprintf(stderr, "ERROR\n");
    return -1;
}
