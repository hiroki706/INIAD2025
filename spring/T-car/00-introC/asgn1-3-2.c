#include <stdio.h>

// 変数aのビット3を0にする
int main(int argc, char const* argv[]){
    int a = 0x55;
    int b = 0xaa;
    b = b & ~(0x01 << 3); // ビット3を0にする
    if ((b & (0x01 << 3)) == 0) {
        printf("pass\n");
    } else {
        printf("fail\n");
    }
    return 0;
}
