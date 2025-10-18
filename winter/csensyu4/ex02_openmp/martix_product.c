#include <stdio.h>
#include <stdlib.h>
#include <omp.h>

int main(int argc, char *argv[]){
    int n;
    if (argc == 2) {
        n = atoi(argv[1]);
    } else {
        n = 64;
    };

    int* vec_a = (int*)malloc(n*n*sizeof(int));
    int* vec_b = malloc(n*n*sizeof(int));
    int* vec_c = malloc(n*n*sizeof(int));

    for (int i=0; i<n*n; i++ ) {
        vec_a[i] = rand();
        vec_b[i] = rand();
    }

    for (int i=0;i<n;i++) {
        for (int j=0;j<n;j++) {
            for (int k=0;k<n;k++) {
                vec_c[n*i+j] += vec_a[n*i+k] * vec_b[n*k+j];
            }
        }
    }
    free(vec_a);free(vec_b);free(vec_c);

    return 0;
}
