#include <stdio.h>
#include <stdlib.h>
#include "set.h"

struct SET{
    __uint8_t* elements; // Pointer to the array of elements
    unsigned int size;   // vector size
    unsigned int n;// Number of elements in the set
};


SET* set_create(unsigned int n) {
    SET* set = (SET*)malloc(sizeof(SET));
    set->n = n;
    set->size = n/8 + 1;
    set->elements= (__uint8_t*)malloc(sizeof(__uint8_t) * set->size);
    return set;
}

void set_destroy(SET* set) {
    free(set->elements);
    free(set);
}


int set_count(const SET* set) {
    int sum = 0;
    for (int i = 0; i < set->size; i++) {
        sum += __builtin_popcount(set->elements[i]);
    }
    return sum;
}

void set_append(SET* set, unsigned int value) {
    if (value <= set->n) {
        set->elements[value / 8] |= (__uint8_t)(1 << (value % 8));
    }
}

void set_remove(SET* set, unsigned int value) {
    if (value <= set->n) {
        set->elements[value / 8] &= (char)~(1 << (value % 8));
    }
}

bool set_contains(const SET* set, unsigned int value) {
    if (value <= set->n) {
        return (set->elements[value / 8] & (1 << (value % 8))) != 0;
    }
    return false;
}

void set_print(const SET* set) {
    printf("{");
    for (int i = 0; i <= set->n; i++) {
        if (set_contains(set, i)) {
            printf("%d, ", i);
        }
    }
    printf("}\n");
}
