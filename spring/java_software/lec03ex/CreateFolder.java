import java.io.File;

public class CreateFolder {
    public static void main(String[] args) {
        File newfloder = new File("./Exercise3-Sample");

        if (newfloder.mkdir()) {
            System.out.println("フォルダを作成しました");
        } else {
            System.out.println("フォルダの作成に失敗しました");
        }
    }
}
