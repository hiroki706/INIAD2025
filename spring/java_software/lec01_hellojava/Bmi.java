public class Bmi {
    public static void printRisk(int age, double h, double w) {
        double bmi = w / ((h / 100) * (h / 100));
        if (age < 45 && bmi < 22.0) {
            System.out.println("Low");
        } else if (age >= 45 && bmi >= 22.0) {
            System.out.println("High");
        } else {
            System.out.println("Medium");
        }
    }
    public static void main(String[] args) {
        int age = 30;
        double h = 170.0;
        double w = 70.0;

        printRisk(age, h, w);
    }
}
