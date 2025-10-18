#include <stdio.h>

// 変数aのビット3が0ならpass, 1ならfail
int main(int argc, char const* argv[]){
    int a = 0x55;
    int b = 0xaa;
    if ((a & (0x01 << 3)) == 0) {
        printf("pass\n");
    } else {
        printf("fail\n");
    }
    return 0;
}
