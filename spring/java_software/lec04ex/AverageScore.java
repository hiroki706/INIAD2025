import java.util.Scanner;

public class AverageScore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] scores = new int[5];

        for (int i = 0; i < scores.length; i++) {
            System.out.print("1つ目のテストの点数 ");
            scores[i] = scanner.nextInt();
            System.out.println();
        }
        scanner.close();
        int sum = 0;
        for (int score : scores) {
            sum += score;
        }
        double average = (double) sum / scores.length;
        System.out.println("5つのテストの平均点は: " + average );
    }
}
