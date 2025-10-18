#include <stdio.h>

// 変数aのビット5,7を0にする
int main(int argc, char const* argv[]){
    int value = 0xffffffff;
    value = value & ~(1 << 5 | 1 << 7);
    if ((value & (0x05 << 5)) == 0) {
        printf("pass\n");
    } else {
        printf("fail\n");
    }
    return 0;
}
