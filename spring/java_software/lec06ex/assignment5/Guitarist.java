package assignment5;

public class Guitarist extends Player {
    public Guitarist(String name, Instrument instrument) {
        super(name, instrument);
    }
    @Override
    public void perform() {
        if (instrument instanceof Guitar) {
            System.out.println(name + "が" + instrument.name + "を演奏しています。");
        } else {
            System.out.println("ギタリストはギターを演奏できません。");
        }
    }
    public void solo() {
        System.out.println(name + "がギターソロを演奏しています！");
    }

}
