
interface Flyable {

    void Fly();

}

interface Swimmable {
    void swim();

}

class Bird implements Flyable, Swimmable {
    public void Fly() {
        System.out.println("Bird can fly");
    }

    public void swim() {
        System.out.println("Birds cant swim");
    }
}

public class Inheritance4 {
    public static void main(String[] args) {
        Bird B1 = new Bird();
        B1.Fly();
        B1.swim();
    }

}
