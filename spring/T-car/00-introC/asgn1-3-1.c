#include <stdio.h>

// 変数aのビット3を1を1にする
int main(int argc, char const* argv[]){
    int a = 0x55;
    int b = 0xaa;
    a = a | (0x01 << 3); // ビット3を1にする
    if ((a & (0x01 << 3)) != 0) {
        printf("pass\n");
    } else {
        printf("fail\n");
    }
    return 0;
}
