public class One {
    public static void main(String[] args) {
        int count = 0;
        for (String arg: args) {
            if (arg.equals("INIAD")) {
                count++;
            }
        }
        System.out.println(count);
    }
}
