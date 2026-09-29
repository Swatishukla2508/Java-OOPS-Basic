abstract class Animal {
    abstract void sound();

}

class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    void sound() {
        System.out.println("Cat mews");
    }
}

public class Abstractioncl1 {
    public static void main(String[] args) {
        Dog D1 = new Dog();
        Cat c1 = new Cat();
        D1.sound();
        c1.sound();
    }

}
