// ユーザーが入力したコマンドを実行する自作シェルを作成せよ
// - fork, execvp, wait, waitpid等を用いて作成せよ
// - 行の入力などにstdio.hの関数を用いてもよい
// - プログラムの実行後、ゾンビプロセスが発生しないことを確認せよ
#include <stdio.h>
#include <stdlib.h>
#include <unistd.h>
#include <sys/types.h>
#include <sys/wait.h>
#include <string.h>
#define MAX_CMD_LEN 1024
#define MAX_ARG_LEN 100

void execute_command(char *command) {
    char *args[MAX_ARG_LEN];
    char *token;
    int i = 0;

    // コマンドをスペースで分割して引数を取得
    token = strtok(command, " \n");
    while (token != NULL && i < MAX_ARG_LEN - 1) {
        args[i++] = token;
        token = strtok(NULL, " \n");
    }
    args[i] = NULL; // 最後にNULLを追加

    pid_t pid = fork(); // 子プロセスを作成
    if (pid < 0) {
        perror("fork failed");
        exit(EXIT_FAILURE);
    } else if (pid == 0) {
        // 子プロセスでコマンドを実行
        execvp(args[0], args);
        perror("exec failed"); // execvpが失敗した場合
        exit(EXIT_FAILURE);
    } else {
        // 親プロセスで子プロセスの終了を待つ
        waitpid(pid, NULL, 0);
    }
}
int main() {
    char command[MAX_CMD_LEN];

    while (1) {
        printf("myshell> ");
        if (fgets(command, sizeof(command), stdin) == NULL) {
            break; // 入力が失敗した場合は終了
        }

        // 空行は無視
        if (strlen(command) <= 1) {
            continue;
        }

        // "exit"コマンドでシェルを終了
        if (strcmp(command, "exit\n") == 0) {
            break;
        }

        execute_command(command);
    }

    return 0;
}
