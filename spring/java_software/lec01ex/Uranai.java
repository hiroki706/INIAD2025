public class Uranai {
    public static void main(String[] args) {
        int birthday = 20041111;
        switch (birthday % 4) {
            case 0:
                System.out.println("大吉");
                break;
            case 1:
                System.out.println("中吉");
                break;
            case 2:
                System.out.println("小吉");
                break;
            case 3:
                System.out.println("凶");
                break;
            default:
                break;
        }
    }
}
