import java.util.Scanner;

public class Practice1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input tow numbers");

        String xs = scanner.next();
        int x = Integer.parseInt(xs);

        String ys = scanner.next();
        int y = Integer.parseInt(ys);
        scanner.close();
        System.out.printf("%d plus %d = %d\n", x, y, x + y);
    }
}
