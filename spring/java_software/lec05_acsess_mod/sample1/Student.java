package sample1;

public class Student {
    public static final int MIN_COURSE_GRADE = 2;
    public static final int MIN_COURSE_CREDIT = 22;
    private final String name;
    private int grade;
    private static int count = 0;
    public Student(String name, int grade) {
        this.name = name;
        this.grade = grade;
        count++;
    }
    public Student(String name) {
        this(name, 1);
    }
// インスタンスメソッドを追加 => public
    public boolean belongsToCourse() {
        return this.grade >= MIN_COURSE_GRADE; // thisは自インスタンス
    }

    // インスタンスメソッドのオーバーロード => public
    public boolean belongsToCourse(int credits) {
        return (this.grade >= MIN_COURSE_GRADE) && (credits >= MIN_COURSE_CREDIT);
    }

    // スタティックメソッドを追加 => public
    public static boolean older(Student a, Student b) {
        return a.grade > b.grade;
    }
    // privateフィールドにアクセスするために、以下のpublic メソッドを追加
    public String getName() {
        return name;
    }
    public int getGrade() {
        return grade;
    }
    public void promoteGrade() {
        grade++;
    }
    public static int getCnt() {
        return count;
    }
}
