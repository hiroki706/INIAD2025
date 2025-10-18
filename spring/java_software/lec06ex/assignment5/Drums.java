package assignment5;

public class Drums extends Instrument {

    public Drums(String name) {
        super(name);
    }

    @Override
    public void play() {
        System.out.printf("%sを叩いています\n", name);
    }

    public void beat() {
        System.out.printf("%sをビートしています\n", name);
    }
}
