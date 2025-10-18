// ls -alを実行する子プロセスを作成するプログラム
#include <stdio.h>
#include <stdlib.h>
#include <unistd.h>
#include <sys/types.h>
#include <sys/wait.h>
#include <string.h>

int main() {
    pid_t pid = fork();

    if (pid == 0) {
        execlp("ls", "ls", "-al", NULL);
        perror("execlp failed");
        exit(EXIT_FAILURE);
    } else {
        int ret;
        waitpid(pid, &ret, 0);
    }

    return 0;
}
