package sample14.anonymous1;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        InputScanner scanner = new InputScanner();
        
        Observer observer = new Observer() {
            @Override
            public void update(InputScanner scanner) {
                String lastLine = scanner.getLastInput();
                System.out.printf("Echo: %s\n", lastLine);
            }
        };

        scanner.addObserver(observer);
        scanner.execute();
    }
}
