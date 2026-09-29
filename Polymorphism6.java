class Animal {
    void sound() {

    }
}

class Dog extends Animal {
    void sound() {

        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    void sound() {
        System.out.println("Cat meow");
    }
}

public class Polymorphism6 {
    public static void main(String[] args) {
        Dog D1 = new Dog();
        D1.sound();
        Cat C1 = new Cat();
        C1.sound();
    }
}
