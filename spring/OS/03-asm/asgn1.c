#include <stdio.h>

extern int sum(int a, int b);

int main(){
    int a = sum(5, 10); // 10 + 9 + 8 + 7 + 6 + 5 = 45
    printf("Sum: %d\n", a);
    return 0;
}
