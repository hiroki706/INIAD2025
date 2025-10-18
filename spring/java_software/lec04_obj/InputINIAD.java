import java.util.Scanner;

public class InputINIAD {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (!scanner.nextLine().equals("INIAD")) {
            System.out.println("NG");
        }
        System.out.println("OK");
        scanner.close();
    }
}
