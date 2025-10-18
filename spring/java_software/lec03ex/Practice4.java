import java.io.FileWriter;
import java.io.IOException;
import java.io.File;

public class Practice4 {
    public static void main(String[] args) {
        File file = new File("./Exercise3-Sample/sample.txt");
        try {
            FileWriter fileWriter = new FileWriter(file);
            fileWriter.write("Hello INIAD");
            fileWriter.close();
        } catch (IOException e) {
            System.out.println(e + "aaa");
        }
    }
}
