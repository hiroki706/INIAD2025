public class FindINIAD {
    public static void main(String[] args) {
        int i = 0;
        for (String arg : args) {
            i += 1;
            if (arg.equals("INIAD")) {
                System.out.println(i);
                return;
            }
        }
        System.out.println("0");
    }
}
