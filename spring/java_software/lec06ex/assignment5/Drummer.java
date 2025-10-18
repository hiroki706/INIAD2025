package assignment5;

public class Drummer extends Player {
    public Drummer(String name, Instrument instrument) {
        super(name, instrument);
    }

    @Override
    public void perform() {
        if (instrument instanceof Drums) {
            System.out.println(name + "が" + instrument.name + "を演奏しています。");
        } else {
            System.out.println("ドラマーはドラムを演奏できません。");
        }
    }

    public void solo() {
        System.out.println(name + "がドラムソロを演奏しています！");
    }

}
