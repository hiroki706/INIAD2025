package sample10.shop4;

import java.io.File;
import java.io.FileWriter;

public class FileLogger implements Logger {
    File file;
    public FileLogger(File file) {
        this.file = file;
    }

    public void purchase(Customer customer, Item item) {
        try {
            FileWriter writer = new FileWriter(file);
            writer.write(String.format("[Purchase] %s: %s(%d yen).\n", customer.getName(), item.getName(), item.getPrice()));
            writer.close();
        }catch (Exception e) {
            System.out.printf("[Error] Failed to write purchase log: %s.\n", e.getMessage());
        }
    }

    public void balance(User user) {
        try {
            FileWriter writer = new FileWriter(file, true);
            writer.write(String.format("[Balance] %s: %d yen.\n", user.getName(), user.getBalance()));
            writer.close();
        }catch (Exception e) {
            System.out.printf("[Error] Failed to write balance log: %s.\n", e.getMessage());
        }
    }

    public void error(User user, String error) {
        try {
            FileWriter writer = new FileWriter(file, true);
            writer.write(String.format("[Error] %s: %s.\n", user.getName(), error));
            writer.close();
        }catch (Exception e) {
            System.out.printf("[Error] Failed to write error log: %s.\n", e.getMessage());
        }
    }
}
