class Vehicle {
    void start() {

    }
}

class Bike extends Vehicle {
    void start() {
        System.out.println("Bike start with self ");
    }
}

class Car extends Vehicle {
    void start() {
        System.out.println("Car start with keys");
    }
}

public class Polymorphism9 {
    public static void main(String[] args) {
        Bike B = new Bike();
        Car C = new Car();

        B.start();
        C.start();
    }

}
