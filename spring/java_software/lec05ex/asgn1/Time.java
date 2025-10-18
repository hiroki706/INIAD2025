package asgn1;

public class Time {
    private int hour, minute, second;

    public Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }
    public int getHour() {
        return hour;
    }
    public void setHour(int hour) {
        if (hour < 0 || hour > 23) {
            System.err.println("不正な値");
        }
        this.hour = hour;
    }
    public int getMinute() {
        return minute;
    }
    public void setMinute(int minute) {
        if (minute < 0 || minute > 59) {
            System.err.println("不正な値");
        }
        this.minute = minute;
    }
    public int getSecond() {
        return second;
    }
    public void setSecond(int second) {
        if (second < 0 || second > 59) {
            System.err.println("不正な値");
        }
        this.second = second;
    }
    public String getCurrentTime() {
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }
}
