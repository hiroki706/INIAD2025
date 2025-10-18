package java_software.lec13_test.sample13.main.java.org.iniad.sample13.assignment2;

public class Number extends Expression{
    private float value;

    public Number(float value) {
        this.value = value;
    }

    public float eval() {
        return value;
    }
}
