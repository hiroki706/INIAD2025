// デバイスファイル /proc/uptime からシステムの稼働時間を読み出し、
// システムの稼働時間を表示するプログラム howoldを作成せよ。
#include <stdio.h>
#include <stdlib.h>

int main() {
    FILE *fp = fopen("/proc/uptime", "r");

    double uptime;
    fscanf(fp, "%lf", &uptime);

    fclose(fp);

    printf("Up for: %.0f seconds\n", uptime);
    return EXIT_SUCCESS;
}
