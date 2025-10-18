#include <stdio.h>
#include "set.h"

int main(){
    int n = 24;
    SET* set = set_create(n);
    set_append(set, 1);
    set_append(set, 2);
    set_append(set, 24);

    set_print(set);
    // {1, 2, 24, }
    printf("Count: %d\n", set_count(set));
    // Count: 3
    set_remove(set, 2);
    set_print(set);
    // {1, 24, }
    set_contains(set, 2) ? printf("Contains 2\n") : printf("Does not contain 2\n");
    // Does not contain 2

    set_destroy(set);
    return 0;
}
