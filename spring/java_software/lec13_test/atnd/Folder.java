package atnd;

import java.util.ArrayList;

public class Folder extends Entry {
    private String name;
    private ArrayList<Entry> children = new ArrayList<Entry>();

    public Folder(String name) {
        this.name = name;
    }

    public void add(Entry e) {
        children.add(e);
    }

    public String getName() {
        return name;
    }

    public int getSize() {
        return children.stream().mapToInt(Entry::getSize).sum();
    }
}
