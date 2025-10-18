package atnd;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Alice"));
        students.add(new Student("Bob"));

        students.forEach(student -> {
            System.out.println("Student Name: " + student.getName());
        });
    }
}
