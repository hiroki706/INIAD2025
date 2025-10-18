    .text
    .globl  sum
sum:
    mov $0, %rax

loop:
    cmp %rdi, %rsi
    jl  fin

    add %rsi, %rax
    sub $1, %rsi

    jmp loop
fin:
    ret
