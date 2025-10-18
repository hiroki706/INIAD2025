package assignment5;

public class Pianist extends Player {
    public Pianist(String name, Instrument instrument) {
        super(name, instrument);
    }

    @Override
    public void perform() {
        if (instrument instanceof Piano) {
            System.out.println(name + "が" + instrument.name + "を演奏しています。");
        } else {
            System.out.println("ピアニストはピアノを演奏できません。");
        }
    }

    public void solo() {
        System.out.println(name + "がピアノソロを演奏しています！");
    }

}
