import java.util.Scanner;
import java.util.Random;

public class Practice2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random r = new Random();
        int computer = r.nextInt(3);
        int player = scanner.nextInt();
        scanner.close();
        System.out.println(isJankenWin(player, computer));
    }

    public static String isJankenWin(int player, int computer) {
        if (player == computer) {
            return "あいこ";
        } else if ((player == 0 && computer == 1)
                || (player == 1 && computer == 2)
                || (player == 2 && computer == 0)) {
            return "あなたの勝ち";
        } else {
            return "あなたの負け";
        }
    }
}
