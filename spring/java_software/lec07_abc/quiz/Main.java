package quiz;

public class Main {
    public static void main(String[] args) {
        Machine m = new Machine("M367", 1000);
        System.out.println(m.getModel());
        System.out.println(m.getPrice());
    }
}
