#include <stdio.h>
#include <stdlib.h>
#include <stdint.h>
#include <mpi.h>

#define N 10000000000

int main(int argc, char* argv[])
{
    long long total, subtotal = 0;

    int number_of_procs; // 起動されたMPIプロセス数(P)
    int my_rank; // 自プロセスのID (0〜(P-1))

    MPI_Init(&argc, &argv);
    MPI_Comm_rank(MPI_COMM_WORLD, &my_rank);
    MPI_Comm_size(MPI_COMM_WORLD, &number_of_procs);

    // 自分のプロセスに割り当てられた分の足し算を実行
    for (long long i = my_rank; i < N; i += number_of_procs) {
        subtotal += i;
    }

    // サーバプロセス(ID=0)のtotal変数にそれぞれのプロセスの小計(subtotal)をリダクション(+)してまとめる
    MPI_Reduce(&subtotal, &total, 1, MPI_LONG_LONG, MPI_SUM, 0, MPI_COMM_WORLD);

    // サーバプロセス(ID=0)で得られた結果を表示
    if (my_rank == 0) {
        printf("total = %lld\n", total);
    }

    MPI_Finalize();
    return 0;
}