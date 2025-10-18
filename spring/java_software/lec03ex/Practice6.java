import java.util.Scanner;
import java.util.Random;

public class Practice6 {
    public static void main(String[] args) {
        int size = 4;
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int[] answer = new int[size];

        for (int i = 0; i < size; i++) {
            answer[i] = random.nextInt(10);
            System.out.println(answer[i]);
        }
        int userInput = 0;
        int[] user = new int[size];
        while (true) {
            userInput = scanner.nextInt();
            if (!(0 <= userInput && userInput < (int)Math.pow(10, size))) {
                System.out.println("too big size");
                continue;
            }
            for (int i=0; i<size; i++) {
                user[i] = userInput % 10;
                userInput /= 10;
            }
            int hit = 0;
            for (int i=0; i<size; i++) {
                if (user[i] == answer[i]) {
                    hit += 1;
                }
            }
            System.out.printf("%d Hit, %d Blow\n", hit, size - hit);
            if (hit == size) {
                System.out.println("You win!");
                break;
            }
        }
        scanner.close();
    }
}
