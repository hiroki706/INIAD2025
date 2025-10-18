#include <stdio.h>
// 実行前に`setarch `uname -m` -R /bin/bash`を実行しておくこと
// これを実行しないと、アドレスが変わる

int main(int argc, char *argv[]){
    int a = 1;
    int b = 2;
    int *p_a, *p_b;
    printf("address a=%p, address b=%p\n", &a, &b);
    // address a=0x7fffffffbb10, address b=0x7fffffffbb14
    p_a = 0x7fffffffbb10;
    p_b = 0x7fffffffbb14;
    printf("a=%d, b=%d\n", *p_a, *p_b);
    return 0;
}
