package asgn1;

public class Circle {
    double radius;
    String color;
    int pointX;
    int pointY;

    public Circle() {
        this.radius = 1.0;
        this.color = "red";
    }

    public Circle(double radius) {
        this.radius = radius;
        this.color = "red";
    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public Circle(int pointX, int pointY) {
        this.radius = 1.0;
        this.color = "red";
        this.pointX = pointX;
        this.pointY = pointY;
    }

    public Circle(double radius, String color, int pointX, int pointY) {
        this.radius = radius;
        this.color = color;
        this.pointX = pointX;
        this.pointY = pointY;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getCircumference() {
        return 2 * Math.PI * radius;
    }

    public double getDistance(Circle other) {
        return Math.sqrt(Math.pow(this.pointX - other.pointX, 2) + Math.pow(this.pointY - other.pointY, 2));
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
