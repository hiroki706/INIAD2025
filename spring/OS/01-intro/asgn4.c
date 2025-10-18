#include <stdio.h>
#include <stdlib.h>

int main() {
    char s[1024];
    int i = 1;
    while(!feof(stdin)) {
        gets(s);
        printf("%d: %s\n", i, s);
        i++;
    }
}
