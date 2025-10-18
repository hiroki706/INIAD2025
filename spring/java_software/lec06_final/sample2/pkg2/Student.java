package sample2.pkg2;

import sample2.pkg1.Member;

public class Student extends Member {
    int grade;

    public Student(String id, String name, int grade) {
        super(id, name);
        this.grade = grade;
    }

    @Override
    public String getProfile() {
        StringBuffer sb = new StringBuffer();
        sb.append("----- Student -----\n");
        sb.append(String.format("ID: %s\n", id));
        sb.append(String.format("Name: %s\n", name));
        sb.append(String.format("Grade: %d\n", grade));
        return sb.toString();
    }
}
