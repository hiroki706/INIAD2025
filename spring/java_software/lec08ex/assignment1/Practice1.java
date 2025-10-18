package assignment1;

public class Practice1 {
    public static void main(String[] args) {
        // MyStack<String> strings = new MyStack<>(10);
        // strings.push("Apple");
        // strings.push("Banana");
        // strings.push("Orange");
        MyStack<Student> students = new MyStack<>(10);
        students.push(new Student("Alice", 10, "001"));
        students.push(new Student("Bob", 12, "002"));

        // System.out.println("strings pop: " + strings.pop());
        System.out.println("students pop: " + students.pop().name);
    }
}
