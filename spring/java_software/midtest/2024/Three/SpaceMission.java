package Three;

public class SpaceMission {
    private static int missionCount = 0;
    private int number;
    private String missionName;
    private String destination;

    public SpaceMission(String missionName, String destination) {
        this.missionName = missionName;
        this.destination = destination;
        this.number = ++missionCount;
    }

    public String getInfo() {
        return String.format("ID: %d, Mission: %s, Destination: %s", number, missionName, destination);
    }

    public static int getMissionCount() {
        return missionCount;
    }
}
