package sample2;

public class Teacher extends Member {
    String title;

    Teacher(String id, String name, String title) {
        super(id, name);
        this.title = title;
    }

    String getTeacherProfile() {
        StringBuffer sb = new StringBuffer();
        sb.append("----- Teacher -----\n");
        sb.append(String.format("ID: %s\n", id));
        sb.append(String.format("Name: %s\n", name));
        sb.append(String.format("Title: %s\n", title));
        sb.append(String.format("Email: %s\n", getEmail()));
        return sb.toString();
    }
}
