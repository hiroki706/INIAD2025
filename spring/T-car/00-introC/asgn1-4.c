// プログラムは関数mainにおいて、function関数を2回呼び出しています。
// 1回目の実行後と2回目の実行後のmain関数内の変数の値を予想する。

#include <stdio.h>
static int global_static_variable = 10;

int function(int argument_variable, int *pointer_variable, int argument_variable2)
{
    static int local_static_variable = 20;

    int local_variable = 10;

    printf("global_static=%d, local_static=%d, local=%d, argument=%d, pointer=%d, argument2=%d\n",
           global_static_variable, local_static_variable, local_variable,
           argument_variable, *pointer_variable, argument_variable2);

    global_static_variable = argument_variable;
    local_static_variable = argument_variable;
    local_variable = argument_variable;
    argument_variable = argument_variable;
    argument_variable2 = argument_variable;
    *pointer_variable = argument_variable;
    return 0;
}

int main(int argc, char const *argv[])
{
    int main_local_variable1 = 1000;
    int main_local_variable2 = 1000;
    int main_local_variable3 = 1000;
    global_static_variable = -20;
    function(main_local_variable1, &main_local_variable2, main_local_variable3);
    // Q1. Answer the expected value of each variable after calling `function`.
    // global_static_variable=[1]
    printf("\nglobal_static=%d ", global_static_variable);
    // local_static_variable=[2]
    // local_variable=[3]
    // main_local_variable1=[4]
    printf("local_val=%d ", main_local_variable1);
    // main_local_variable2=[5]
    printf("main_local_variable2=%d ", main_local_variable2);
    // main_local_variable3=[6]
    printf("main_local_variable3=%d\n", main_local_variable3);

    main_local_variable3 = 2000;
    function(main_local_variable1, &main_local_variable2, main_local_variable3);
    // Q2. Answer the expected value of each variable after calling `function`.
    // global_static_variable=[7]
    printf("\nglobal_static=%d ", global_static_variable);
    // local_static_variable=[8]
    // local_variable=[9]
    // main_local_variable1=[10]
    printf("local_val=%d ", main_local_variable1);
    // main_local_variable2=[11]
    printf("main_local_variable2=%d ", main_local_variable2);
    // main_local_variable3=[12]
    printf("main_local_variable3=%d\n", main_local_variable3);
    return 0;
}
