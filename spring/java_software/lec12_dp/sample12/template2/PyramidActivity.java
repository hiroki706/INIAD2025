package sample12.template2;

public class PyramidActivity extends Activity{
    @Override
    protected void onStart() {
        System.out.println("PyramidActivity starts.");
    }
    @Override
    protected void onStop() {
        System.out.println("PyramidActivity stops.");
    }
    @Override
    protected void onInput(String input) {
        try {
            int n = Integer.parseInt(input);
            if(n < 0) {
                System.out.println("Input a positive number.");
            } else {
                for(int i = 0; i < n; i++) {
                    for(int j = 0; j < n - i - 1; j++)
                        System.out.print("  ");
                    for(int j = 0; j < 2 * i + 1; j++)
                        System.out.print("##");
                    System.out.println();
                }
            }
        } catch (NumberFormatException e) {
            System.out.println("Input a number.");
        }
    }
}
