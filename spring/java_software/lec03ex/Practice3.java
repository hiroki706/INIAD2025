import java.util.Scanner;

public class Practice3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input tow numbers");

        try {
            String xs = scanner.next();
            int x = Integer.parseInt(xs);

            String ys = scanner.next();
            int y = Integer.parseInt(ys);
            System.out.printf("%d plus %d = %d\n", x, y, x + y);
        } catch (NumberFormatException e) {
            System.out.println("Please input an Integer");
        }
        scanner.close();
    }
}
