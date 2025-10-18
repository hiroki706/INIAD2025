package sample1.pkg2;

import sample1.pkg1.Member;

public class Student extends Member {
    protected int grade;

    public Student(String id, String name, int grade) {
        super(id, name);
        this.grade = grade;
    }

    @Override
    protected String getEmail() {
        return this.id + DOMAIN;
    }

    @Override
    public String getProfile() {
        StringBuffer sb = new StringBuffer();
        sb.append("----- Student -----\n");
        sb.append(super.getProfile());
        sb.append(String.format("Grade: %d\n", grade));
        return sb.toString();
    }

    @Override
    public boolean canReserveRoom() {
        return false;
    }
}
