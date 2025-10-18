#include <stdint.h>
#include <stdio.h>

#define REG_PIDATA (*((volatile uint32_t*) 0x400c0800))
#define REG_PICR   (*((volatile uint32_t*)(REG_PIDATA + 0x04)))
#define REG_PIPUP (*((volatile uint32_t*)(REG_PIDATA + 0x2c)))
#define REG_PIPDN (*((volatile uint32_t*)(REG_PIDATA + 0x30)))

int main(void) {
    REG_PIDATA &= ~(1 << 4);
    REG_PICR |= (1 << 4);

    int h = REG_PIPUP & 0x7f;
    int l = REG_PIPDN & 0x7f;

    printf("h: %d, l: %d\n", h, l);
}
