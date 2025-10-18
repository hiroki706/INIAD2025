package assignment3;

abstract public class Employee {
    private String name;
    private int id;

    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    abstract public double calculateSalary();

    public String displayEmployeeDetail() {
        return "ID: " + id + ", Name: " + name;
    }
}
