
.syntax unified
.thumb

.section .vectors
.long 0x20002000  // Initial Stack Pointer
.long Reset_Handler + 1 // Reset Handler

.section .text
.global Reset_Handler
.type Reset_Handler, %function
Reset_Handler:
    // Call main
    bl main
    // Loop forever if main returns
    b .
