package assignment3;

public class FullTimeEmployee extends Employee {
    private double yearlySalary;

    public FullTimeEmployee(String name, int id, double yearlySalary) {
        super(name, id);
        this.yearlySalary = yearlySalary;
    }
    @Override
    public double calculateSalary() {
        return yearlySalary / 12;
    }
}
