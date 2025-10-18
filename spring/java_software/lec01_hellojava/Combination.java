public class Combination {
    public static int combination(int n, int r) {
        int x = 1;
        for(int i=0; i<r; i++) {
            x *= (n - i);
        }
        for(int i=r;i!=1;i--) {
            x /= i;
        }
        return x;
    }

    public static void main(String[] args) {
        int n = 10;
        int r = 3;
        int c = combination(n, r);
        System.out.println(c);
    }
}
