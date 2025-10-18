package assignment3;

public class Practice3 {
    public static void main(String[] args) {
        FullTimeEmployee fullTimeEmployee = new FullTimeEmployee("Alice", 1, 5_000_000);
        PartTimeEmployee partTimeEmployee = new PartTimeEmployee("Bob", 2, 1_500, 20);

        System.out.println(fullTimeEmployee.displayEmployeeDetail());
        System.out.println("Monthly Salary: " + fullTimeEmployee.calculateSalary() + "Yen");
        System.out.println(partTimeEmployee.displayEmployeeDetail());
        System.out.println("Monthly Salary: " + partTimeEmployee.calculateSalary() + "Yen");
    }
}
