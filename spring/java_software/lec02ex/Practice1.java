public class Practice1 {
    public static void main(String[] args) {
        String repeated = repeatString("Hello", 5);
        System.out.println(repeated);
    }
    public static String repeatString(String str, int n) {
        String result = "";
        for (int i = 0; i < n; i++) {
            result += str;
        }
        return result;
    }
}
