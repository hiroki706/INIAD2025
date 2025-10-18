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

    if (my_rank == SERVER_RANK) {
        MPI_Status status;
        char message[100];

        // クライアントからのメッセージを順番に受信して表示
        for (int client = 1; client < number_of_procs; client++) {
            MPI_Recv(message, sizeof(message), MPI_CHAR, MPI_ANY_SOURCE, 0, MPI_COMM_WORLD, &status);
            printf("Received: \"%s\"\n", message);
        }
    }
    else {
        char message[100];
        sprintf(message, "Hi! I am client %d!", my_rank);

        // SERVER_RANK あてに message (NUL文字含む) のデータを送信
        MPI_Send(message, strlen(message) + 1, MPI_CHAR, SERVER_RANK, 0, MPI_COMM_WORLD);
    }
    
    MPI_Finalize();
    return 0;
}
