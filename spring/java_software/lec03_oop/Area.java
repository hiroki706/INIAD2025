import java.util.Random;

public class Area {
    public static void main(String[] args) {
        Random random = new Random();

        int radius = random.nextInt(10);

        double area = Math.PI * Math.pow(radius, 2);
        System.out.println("The area of a circle with radius of " + radius + " is " + area);
    }
}
