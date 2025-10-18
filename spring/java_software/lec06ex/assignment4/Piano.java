package assignment4;

public class Piano extends Instrument {
    public Piano(String name) {
        super(name);
    }
    @Override
    public void play() {
        System.out.printf("%sを弾いています\n", name);
    }
    public void pressKey() {
        System.out.printf("%sの鍵盤を押しています\n", name);
    }
}
