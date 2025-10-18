#include <stdio.h>
#include <stdlib.h>

int main(int argc, char const* argv[]) {
    if (argc <= 1) {
        printf("時刻を指定してください");
        return 1;
    }
    int time = atoi(argv[1]);

    if (5 <= time && time < 11) {
        printf("おはようございます");
    } else if (11 <= time && time < 18){
        printf("こんにちは");
    } else if (18 <= time && time < 21){
        printf("こんばんは");
    } else{
        printf("おやすみなさい");
    }
}
