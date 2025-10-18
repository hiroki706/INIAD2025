#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <mpi.h>

#define SERVER_RANK 0

int main(int argc, char* argv[])
{
    int number_of_procs;
    int my_rank;

    MPI_Init(&argc, &argv);
    MPI_Comm_rank(MPI_COMM_WORLD, &my_rank);
    MPI_Comm_size(MPI_COMM_WORLD, &number_of_procs);

    char buf[100];
    if (my_rank==SERVER_RANK) {
        fgets(buf, sizeof(buf), stdin);
    }
    MPI_Bcast(buf, sizeof(buf), MPI_CHAR, SERVER_RANK, MPI_COMM_WORLD);

    printf("Received: %s\n", buf);

    MPI_Finalize();
    return 0;
}
