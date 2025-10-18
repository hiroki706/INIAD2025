package assignment2;

public class Practice2 {
public static void main(String[] args) {
    Human human = new Human();
    Dog dog = new Dog();
    Cat cat = new Cat();

    for (Animal animal : new Animal[]{human, dog, cat}) {
        animal.eat();
        System.out.println(animal.getStomach());
        animal.run();
        System.out.println(animal.getStomach());
    }
    System.out.println(dog.bark());
    System.out.println(cat.bark());
    System.out.println(human.talk());
}
}
