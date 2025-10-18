// Assembly function to trigger a semihosting call
static inline int __semihost(int command, const void *message) {
    int result;
    __asm__ volatile (
        "mov r0, %1\n"
        "mov r1, %2\n"
        "bkpt 0xab\n"
        "mov %0, r0"
        : "=r" (result)
        : "r" (command), "r" (message)
        : "r0", "r1", "memory"
    );
    return result;
}

int main() {
    // ADP_Stopped_ApplicationExit
    // This call tells the debugger that the application has finished.
    __semihost(0x18, (void*)0x20026); // 0x20026 is the "Application Exit" reason code
    return 0; // Should not be reached
}