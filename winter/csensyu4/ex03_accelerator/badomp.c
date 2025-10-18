#include <omp.h>
#include <stdio.h>
#include <stdlib.h>

#define N 100000000

int main(){
    long long i;
    long long total = 0;

    #pragma omp parallel for shared(total)
    for(i=0;i<N;i++) {
        #pragma omp atomic
        total += i;
    }

    printf("total = %lld\n", total);
    return 0;
}
