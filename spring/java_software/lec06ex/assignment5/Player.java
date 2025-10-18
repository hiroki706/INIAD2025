package assignment5;

public class Player {
    protected String name;
    protected Instrument instrument;
    public Player(String name, Instrument instrument) {
        this.name = name;
        this.instrument = instrument;
    }

    public void perform() {
        System.out.println(name + "が" + instrument.name + "を演奏しています。");
    }
}
