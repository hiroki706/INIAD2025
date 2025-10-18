// 出席課題
public class Fact {
    public static int fact(int n) {
    // Fill in here.
        if (n == 0) {
            return 1;
        } else {
            return n * fact(n - 1);
        }
    }

    public static void main(String[] args) {
        int n = 5;
        int f = fact(n);
        System.out.printf("fact(%d) = %d\n", n, f);
    }
}
