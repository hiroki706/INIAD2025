package sample1;

import sample1.pkg1.Member;
import sample1.pkg2.Student;
import sample1.pkg2.Teacher;
import sample1.pkg2.EngineeringTeacher;
import sample1.pkg1.Programmer;

@SuppressWarnings("unused")
public class Main {
    public static void main(String[] args) {
        Student student = new Student("1234", "Taro", 1);
        System.out.printf(student.getProfile());

        EngineeringTeacher pteacher = new EngineeringTeacher("1000", "Inoue", "Professor");
        System.out.printf(pteacher.getProfile());
        checkSkill(pteacher);
    }

    private static void checkSkill(Programmer p) {
        if (p.canWritePython()) {
            System.out.println("Can write Python");
        }
        if (p.canWriteC()) {
            System.out.println("Can write C");
        }
        if (p.canWriteJava()) {
            System.out.println("Can write Java");
        }
    }
}
