#include <stdio.h>
#include <stdlib.h>

#define BUFFER_SIZE 1024

int main(int argc, char *argv[]) {
    FILE *source = fopen(argv[1], "rb");
    FILE *dist = fopen(argv[2], "wb");

    char buffer[BUFFER_SIZE];
    size_t bytesRead;

    while ((bytesRead = fread(buffer, 1, BUFFER_SIZE, source)) > 0) {
        fwrite(buffer, 1, bytesRead, dist);
    }

    fclose(source);
    fclose(dist);

    return 0;
}
