// 与えられたファイルの最後のn行を表示するコマンド
// mmap(2)を使用して実装する
#include <sys/mman.h>
#include <sys/fcntl.h>
#include <sys/stat.h>
#include <unistd.h>
#include <stdio.h>
#include <stdlib.h>

#define DEFAULT_LINES 3

int main(int argc, char *argv[]) {
    int er, i, count, fd = -1;
    struct stat fileinfo;
    char* map = NULL;
    int lines_num = DEFAULT_LINES;

    if (argc < 2) {
        fprintf(stderr, "Usage: mytail2 <file> [-n {uint}]\n");
        return 1;
    }

    if (argc == 4 && argv[2][0] == '-' && argv[2][1] == 'n') {
        lines_num = atoi(argv[3]);
        if (DEFAULT_LINES <= 0) {
            fprintf(stderr, "Invalid number of lines: %s\n", argv[3]);
            return 1;
        }
    }

    fd = open(argv[1], O_RDONLY);
    if (fd < 0) goto error;

    er = fstat(fd, &fileinfo);
    if (er < 0) goto error;

    map = (char*)mmap(NULL, fileinfo.st_size, PROT_READ, MAP_PRIVATE, fd, 0);

    if (map == MAP_FAILED) goto error;

    for (i = 0, count = 0; i < fileinfo.st_size
            && count < lines_num; i++) {
        if (map[i] == '\n') {
            count++;
        }
    }

    if (count < lines_num) {
        printf("%s", map);
    } else {
        int start = fileinfo.st_size - 1;
        int lines_to_print = lines_num;
        while (start >= 0 && lines_to_print > 0) {
            if (map[start] == '\n') {
                lines_to_print--;
            }
            start--;
        }
        start++;
        printf("%s", map + start);
    }

    munmap(map, fileinfo.st_size);
    close(fd);
    return 0;

 error:
    if (map) munmap(map, fileinfo.st_size);
    if (fd >= 0) close(fd);
    fprintf(stderr, "ERROR\n");
    return 1;

}
