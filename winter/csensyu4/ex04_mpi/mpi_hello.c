#include <stdio.h>
#include <stdlib.h>
#include <mpi.h>

int main(int argc, char* argv[])
{
    int number_of_procs;
    int my_rank;

    MPI_Init(&argc, &argv);
    MPI_Comm_rank(MPI_COMM_WORLD, &my_rank);
    MPI_Comm_size(MPI_COMM_WORLD, &number_of_procs);

    printf("%d of %d: Hello world!\n", my_rank, number_of_procs);
    
    MPI_Finalize();
    return 0;
}