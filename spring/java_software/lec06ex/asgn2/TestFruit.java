import fruit.*;


public class TestFruit {
    public static void main(String[] args) {
        Orange orange = new Orange();
        Durian durian = new Durian();
        Apple apple = new Apple();

        System.out.println("Durian 1: " + durian.getState());
        System.out.println("Orange 1: " + orange.getState());
        System.out.println("Apple 1: " + apple.getState());
        orange.peel();
        durian.peel();
        apple.peel();
        System.out.println("Durian 1: " + durian.getState());
        System.out.println("Orange 1: " + orange.getState());
        System.out.println("Apple 1: " + apple.getState());
        }}
