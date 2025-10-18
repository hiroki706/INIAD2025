//asgn1
#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <mpi.h>

#define SERVER_RANK 0
#define N 10

int main(int argc, char* argv[])
{
    int number_of_procs;
    int my_rank;

    MPI_Init(&argc, &argv);
    MPI_Comm_rank(MPI_COMM_WORLD, &my_rank);
    MPI_Comm_size(MPI_COMM_WORLD, &number_of_procs);
    if (my_rank == SERVER_RANK) {
        MPI_Status status;
        int message;
        long long accumrate = 0;

        for (int client = 1; client < number_of_procs; client++) {
            MPI_Recv(&message, 1, MPI_INT, client, 0, MPI_COMM_WORLD, &status);
            accumrate += message;
        }
        printf("Result: %lld\n", accumrate);
    }
    else {
        int mysum=0;
        for (int i=my_rank-1; i<N; i+=(number_of_procs-1)) {
            mysum += i;
        }
        MPI_Send(&mysum, 1, MPI_INT, SERVER_RANK, 0, MPI_COMM_WORLD);
    }

    MPI_Finalize();
    return 0;
}
