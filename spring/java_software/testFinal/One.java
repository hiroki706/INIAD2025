public class One {
    public static void main(String[] args) {
        if(args.length < 2) {
            System.out.println("-");
            return;
        }

        if(args[0].equals(args[args.length-1])) {
            System.out.println("OK");
        } else {
            System.out.println("NG");
        }
    }
}
