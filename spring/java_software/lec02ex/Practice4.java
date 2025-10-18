public class Practice4 {
    public static void main(String[] args) {
        String[] reversed = new String[args.length];
        for (int i = args.length - 1; 0 <= i; i--) {
            reversed[args.length - i - 1] = args[i];
        }
        for (String arg : reversed) {
            System.out.println(arg);
        }
    }
}
