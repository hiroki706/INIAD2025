import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class Practice5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");

        System.out.println("予定のタイトルを入力してください:");
        String title = scanner.nextLine();

        System.out.println("予定の開始日時を入力してください (yyyy-MM-dd HH:mm):");
        String startDateTimeStr = scanner.nextLine();
        LocalDateTime startDateTime = null;
        try {
            startDateTime = LocalDateTime.parse(startDateTimeStr, formatter);
        } catch (DateTimeParseException e) {
            System.out.println("日時の形式が正しくありません。");
            scanner.close();
            return;
        }
        LocalDateTime now = LocalDateTime.now();
        if (startDateTime.isAfter(now)) {
            System.out.println(title+"は未来の予定です。");
        } else {
            System.out.println(title+"は過去のものです。");
        }
        scanner.close();
    }
}
