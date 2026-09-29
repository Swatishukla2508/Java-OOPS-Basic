class Animal {
    void Sound() {
        System.out.println("All animals are not harmful");
    }
}

class Dog extends Animal {

    void Bark() {
        System.out.println("The dog is barking");
    }
}

public class Inheritance1 {
    public static void main(String[] args) {
        Animal A1 = new Animal();
        Dog D1 = new Dog();
        A1.Sound();
        D1.Bark();
    }

}
