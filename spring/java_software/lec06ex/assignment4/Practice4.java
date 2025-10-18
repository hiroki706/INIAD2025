package assignment4;

public class Practice4 {
    public static void main(String[] args) {
        Instrument instrument = new Instrument("楽器");
        Guitar guitar = new Guitar("ギター");
        Drums drums = new Drums("ドラム");
        Piano poano = new Piano("ピアノ");

        instrument.play();
        guitar.play();
        guitar.strum();
        drums.play();
        drums.beat();
        poano.play();
        poano.pressKey();
    }
}
