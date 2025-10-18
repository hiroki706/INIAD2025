package atnd;

public class DeliciouFood extends Item implements Eatable {
    public DeliciouFood(String name, int price) {
        super(name, price);
    }
    @Override
    public String getTaste() {
        return "Delicious";
    }
    @Override
    public int getTaxPrice() {
        return (int) (price * 1.08);
    }
}
