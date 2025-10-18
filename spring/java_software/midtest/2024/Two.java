import java.util.Scanner;

public class Two {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String next;
        StringBuffer sb = new StringBuffer("");
        while (!(next = scanner.nextLine()).equals("")) {
            sb.append(next.toUpperCase().charAt(0));
        }
        scanner.close();
        System.out.println(sb.toString());
    }
}
