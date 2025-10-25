#include <stdio.h>
#include <stdlib.h>
#include <time.h>

#define N 500000000

int main(int argc, char* argv[])
{
    long long i;
    long long count = 0;
    double x, y;

    /* srandの引数についてはすべてのプロセスの乱数が異なる系列となるように、プロセスIDが含まれるように修正すること
       例: srand(time(NULL) * my_rank); */
    srand(time(NULL));

    for (i = 0; i < N; i++) {
        // (0, 0)-(1, 1) の範囲に収まる点 (x, y) をランダムに生成する
        x = rand() / (double)RAND_MAX;
        y = rand() / (double)RAND_MAX;

        // (x, y) が単位円に含まれるならば、カウントを +1 する
        if (x * x + y * y <= 1.0) {
            count += 1;
        }
    }

    // 得られた円周率の近似値を表示
    printf("pi = %.10f\n", count * 4.0 / (double)N);

    return 0;
}
