package sample2;

import sample2.pkg1.Member;
import sample2.pkg2.Student;
import sample2.pkg2.Teacher;

@SuppressWarnings("unused")
public class Main {
    public static void main(String[] args) {
        Student student = new Student("1234", "Taro", 1);
        System.out.printf(student.getProfile());

        Teacher teacher = new Teacher("1000", "Inoue", "Professor");
        System.out.printf(teacher.getProfile());
        }
}
