package asgn3;

public class Visitor extends Person {
    private String membershipNumber;

    public Visitor(int age, String name, String membershipNumber) {
        super(name, age);
        this.membershipNumber = membershipNumber;
    }
    public String getMembershipNumber() {
        return membershipNumber;
    }
}
