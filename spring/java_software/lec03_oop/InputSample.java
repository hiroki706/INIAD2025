import java.util.Scanner;

public class InputSample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line;
        StringBuffer acc = new StringBuffer();
        while (!(line = scanner.nextLine()).equals("")) {
            acc.append(line);
            acc.append("\n");
        }
        System.out.print(acc.toString().trim());
    }
}
