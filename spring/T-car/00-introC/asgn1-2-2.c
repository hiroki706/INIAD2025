#include <stdio.h>

// 変数bのビット3が1ならpass, 0ならfail
int main(int argc, char const* argv[]){
    int a = 0x55;
    int b = 0xaa;
    if ((b & (0x01 << 3)) != 0) {
        printf("pass\n");
    } else {
        printf("fail\n");
    }
    return 0;
}
