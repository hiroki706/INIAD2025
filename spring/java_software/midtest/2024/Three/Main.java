package Three;

public class Main {
    public static void main(String[] args) {
        SpaceMission mission1 = new SpaceMission("Voyager 1", "Interstellar Space");
        SpaceMission mission2 = new SpaceMission("Apollo 11", "Moon");
        System.out.println(mission1.getInfo());
        System.out.println(mission2.getInfo());
        System.out.println("Total number of missions: " + SpaceMission.getMissionCount());
    }
}
