#include <stdio.h>
#include <stdlib.h>

int main()
{
    int *a, *b, *c;
    int i;

    srand(0);
    int size = 3;
    // 1. メモリの割当
    a = malloc(3*sizeof(int)+1);
    b = malloc(3*sizeof(int)+1);
    c = malloc(3*sizeof(int)+1);

    // 2. a, b にランダムな値を設定
    for (i = 0; i < 3; i++) {
        a[i] = rand();
        b[i] = rand();
    };

    // 3. cの計算を行う
    for (i = 0; i < 3; i++) {
        c[i] = a[i]+ b[i];
        printf("%d", c[i]);
    };

    // 4. メモリの解放
    free(a);free(b);free(c);

    return 0;
}
