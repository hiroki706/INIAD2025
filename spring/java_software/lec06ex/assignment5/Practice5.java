package assignment5;

public class Practice5 {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        Guitar guitar = new Guitar("ギター");
        Drums drums = new Drums("ドラム");
        Piano piano = new Piano("ピアノ");

        Guitarist guitarist = new Guitarist("Alice", drums);
        Drummer drummer = new Drummer("Bob", drums);
        Pianist pianist = new Pianist("Inoue", piano);

        ConcertManager manager = new ConcertManager(5);

        manager.addPlayer(guitarist);
        manager.addPlayer(drummer);
        manager.addPlayer(pianist);

        manager.startConcert();
    }
}
