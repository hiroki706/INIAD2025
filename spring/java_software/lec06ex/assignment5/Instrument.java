package assignment5;

public class Instrument {
    protected String name;

    public Instrument(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void play() {
        System.out.printf("%sを演奏しています\n", name);
    }
}
