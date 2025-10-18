    .text
    .globl  sigma
sigma:
    mov $0, %eax    /* %eax = 0; */

cont:
    cmp $0, %edi    /* if (%edi < 0) goto fin; */
    jl  fin

    add %edi, %eax  /* %eax += %edi; */
    sub $1, %edi    /* %edi -= 1; */

    jmp cont        /* goto cont; */
fin:
    ret
