public class Practice3 {
    public static void main(String[] args) {
        int totalSeconds = 3665;
        String time = conveertSeconds(totalSeconds);
        System.out.println("Converted seconds: " + time);
    }

    public static String conveertSeconds(int seconds) {
        String ans = "";
        int hours = seconds / 3600;
        ans += hours + ":";
        int minutes = (seconds % 3600) / 60;
        ans += minutes + ":";
        int remainingSeconds = seconds % 60;
        ans += remainingSeconds;
        return ans;
    }
}
