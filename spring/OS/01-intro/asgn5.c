#include <stdio.h>
#include <stdlib.h>
#include <string.h>
int endwith(char* str, char suffix) {
    int len = strlen(str);
    if (len == 0) {
        return 0;
    }
    if (str[len - 1] == suffix) {
        return 1;
    }
    return 0;
}

int main(){
    char buf[20];
    int i = 2;
    printf("     1\t");
    int flag = 0;
    while (fgets(buf, sizeof(buf), stdin) != NULL) {
        if (flag) {
            printf("%6d\t", i);
            i++;
            flag = 0;
        }
        printf("%s", buf);
        flag = endwith(buf, '\n');
    }
    return 0;
}
