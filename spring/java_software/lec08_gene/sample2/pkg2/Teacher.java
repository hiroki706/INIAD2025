package sample2.pkg2;

import sample2.pkg1.Member;

public class Teacher extends Member {
    String title;

    public Teacher(String id, String name, String title) {
        super(id, name);
        this.title = title;
    }

    @Override
    protected String getEmail() {
        return this.name + DOMAIN;
    }

    @Override
    public String getProfile() {
        StringBuffer sb = new StringBuffer();
        sb.append("----- Teacher -----\n");
        sb.append(super.getProfile());
        sb.append(String.format("Title: %s\n", title));
        return sb.toString();
    }

    @Override
    public boolean canReserveRoom() {
        return true;
    }
}
