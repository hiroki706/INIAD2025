// 標準入力からテキストデータを受け取り、
// 入力の最後の3行を出力するプログラムを作成せよ。
#include <stdio.h>
#include <string.h>

int main(void) {
    char line[256];
    char lines[3][256];
    int count = 0;

    // 標準入力からテキストデータを受け取る
    while (fgets(line, sizeof(line), stdin) != NULL) {
        // 入力の最後の3行を保存する
        lines[count % 3][0] = '\0'; // 初期化
        strncat(lines[count % 3], line, sizeof(lines[count % 3]) - 1);
        count++;
    }

    // 入力の最後の3行を出力する
    for (int i = 0; i < 3; i++) {
        if (count > i) {
            printf("%s", lines[(count + i) % 3]);
        }
    }

    return 0;
}
