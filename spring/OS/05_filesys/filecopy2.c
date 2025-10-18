// システムコールを用いたファイルコピー
// (open, read, write, close)
#include <stdio.h>
#include <fcntl.h>
#include <unistd.h>

int main(int argc, char *argv[]) {
    int src, distf;
    char buf[1];
    int n;

    if (argc != 3) {
        fprintf(stderr, "Usage: %s <source> <destination>\n", argv[0]);
        return 1;
    }

    src = open(argv[1], O_RDONLY);
    if (src < 0)goto err;

    distf = open(argv[2], O_WRONLY | O_CREAT | O_TRUNC, 0644);
    if (distf < 0) goto err;

    while ((n = read(src, buf, sizeof(buf))) > 0) {
        write(distf, buf, n);
    }

    if (n < 0) {
        perror("read");
    }

    // ファイルクローズ
    close(src);
    close(distf);

    return 0;
err:
    if (src >= 0) close(src);
    if (distf >= 0) close(distf);
    perror("open");
    return 1;
}
