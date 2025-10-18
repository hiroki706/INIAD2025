package asgn3;

public class Person {
    private int age;
    private String name;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public String introduce() {
        return "私の名前は" + name + "です。年齢は" + age + "です。";
    }
}
