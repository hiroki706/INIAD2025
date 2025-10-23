/*
 *----------------------------------------------------------------------
 *    micro T-Kernel 3.00.00
 *
 *    Copyright (C) 2006-2019 by Ken Sakamura.
 *    This software is distributed under the T-License 2.1.
 *----------------------------------------------------------------------
 *
 *    Released by TRON Forum(http://www.tron.org) at 2019/12/11.
 *
 *----------------------------------------------------------------------
 */

#include <tk/tkernel.h>
#include <tm/tmonitor.h>

void test_task(INT stacd, void *exinf) {
    tm_printf("Hello, T-Kernel world!\n");
    for(;;) {
        tk_dly_tsk(1000); // 1秒待つ
    }
}

WEAK_FUNC EXPORT INT usermain(void) {
    T_CTSK ctsk;
    ID tskid;

    ctsk.tskatr = TA_HLNG | TA_RNG0;
    ctsk.task = test_task;
    ctsk.itskpri = 10;
    ctsk.stksz = 1024;

    tskid = tk_cre_tsk(&ctsk);
    if (tskid < E_OK) {
        tm_printf("tk_cre_tsk error: %d\n", tskid);
        return tskid;
    }

    tk_sta_tsk(tskid, 0);

    // usermainは終了してはならない
    tk_slp_tsk(TMO_FEVR);

    return 0; // ここには来ない
}
