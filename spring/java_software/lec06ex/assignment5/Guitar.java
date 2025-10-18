package assignment5;

public class Guitar extends Instrument {

    public Guitar(String name) {
        super(name);
    }

    @Override
    public void play() {
        System.out.printf("%sを弾いています\n", name);
    }
    public void strum() {
        System.out.printf("%sをストラムしています\n", name);
    }
}
