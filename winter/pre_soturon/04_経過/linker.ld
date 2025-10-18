
MEMORY
{
  FLASH (rx) : ORIGIN = 0x00000000, LENGTH = 128K
  RAM (rwx) : ORIGIN = 0x20000000, LENGTH = 64K
}

SECTIONS
{
  .text : {
    . = ALIGN(4);
    KEEP(*(.vectors))
    *(.text*)
    . = ALIGN(4);
  } > FLASH

  .data : {
    . = ALIGN(4);
    *(.data*)
    . = ALIGN(4);
  } > RAM AT > FLASH

  .bss : {
    . = ALIGN(4);
    *(.bss*)
    end = .;
    . = ALIGN(4);
  } > RAM
}
