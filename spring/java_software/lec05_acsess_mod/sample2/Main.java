package sample2;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("1234", "Taro", 1);
        System.out.printf(student.getStudentProfile());

        Teacher teacher = new Teacher("1000", "Inoue", "Professor");
        System.out.printf(teacher.getTeacherProfile());
        }
}
