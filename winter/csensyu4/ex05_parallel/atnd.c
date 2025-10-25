#include <stdio.h>
#include <stdlib.h>
#include <time.h>

int main() {
    time_t t = time(NULL);
    srand(t);

    for (int i=0;i<10;i++) {
        printf("%d %d\n", i+1, rand());
    }
}
