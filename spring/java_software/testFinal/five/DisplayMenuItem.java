package five;

public class DisplayMenuItem extends Menu implements Displayable {
    public DisplayMenuItem(String name, int price) {
        super(name, price);
    }

    public String displayTitle() {
        return "# " + getName();
    }

    public String displayDetail() {
        return "- Price: " + getPrice() + " yen";
    }
}
