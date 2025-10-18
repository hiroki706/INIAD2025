package sample1;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Taro", 3);
        System.out.printf("%s %d\n", student.getName(), student.getGrade());
        Student student2 = new Student("Jiro");
        System.out.printf("%s %d\n", student2.getName(), student2.getGrade());

        if(student.belongsToCourse(20)) {
            System.out.println("Belongs to a course.");
        }
        // スタティックフィールドを参照
        System.out.printf("%d students in total.\n", Student.getCnt());
        // スタティックメソッドを呼び出し
        if(Student.older(student, student2)) {
            System.out.printf("%s is older than %s.\n", student.getName(), student2.getName());
        }
    }
}
