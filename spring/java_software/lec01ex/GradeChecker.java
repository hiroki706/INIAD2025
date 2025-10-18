public class GradeChecker {
    public static void main(String[] args) {
        int score = 85;
        if (0<=score && score<60) {
            System.out.println("D");
        } else if (60<=score && score<70) {
            System.out.println("C");
        } else if (70<=score && score<80) {
            System.out.println("B");
        } else if (80<=score) {
            System.out.println("A");
        }
    }
}
