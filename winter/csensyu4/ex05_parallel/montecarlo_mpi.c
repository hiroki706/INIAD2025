// mpicc -Wall ./montecarlo_mpi.c -o ./montecarlo_mpi.out
// mpirun -np 4 ./montecarlo_mpi.out

#include <stdio.h>
#include <stdlib.h>
#include <time.h>
#include <mpi.h>

#define N 500000000

int main(int argc, char* argv[])
{
    long long i;
    long long count, subcount = 0;
    double x, y;

    int number_of_procs;
    int my_rank;

    MPI_Init(&argc, &argv);
    MPI_Comm_rank(MPI_COMM_WORLD, &my_rank);
    MPI_Comm_size(MPI_COMM_WORLD, &number_of_procs);

    srand(time(NULL) + number_of_procs*my_rank );

    for (i = my_rank; i < N; i += number_of_procs) {
        x = rand() / (double)RAND_MAX;
        y = rand() / (double)RAND_MAX;

        if (x * x + y * y <= 1.0){
            subcount += 1;
        }
    }

    MPI_Reduce(&subcount, &count, 1, MPI_LONG_LONG, MPI_SUM, 0, MPI_COMM_WORLD);

    if(my_rank==0)
        printf("pi = %.10f\n", count * 4.0 / (double)N);

    MPI_Finalize();
    return 0;
}
