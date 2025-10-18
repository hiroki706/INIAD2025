package asgn1;

public class Practice1 {
    public static void main(String[] args) {
        Time time = new Time(16, 7, 30);

        time.setHour(time.getHour() + 1);

        System.out.println("現在の時刻は" + time.getCurrentTime()+ "です");
    }
}
