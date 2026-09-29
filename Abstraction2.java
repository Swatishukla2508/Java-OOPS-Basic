abstract class Vehicle {
    abstract void start();

    void fuel() {
    }

}

class Bike extends Vehicle {
    void fuel() {
        System.out.println("Bike run on petrol");

    }

    void start() {
        System.out.println("Bike start by self");
    }

}

class Truck extends Vehicle {
    void fuel() {
        System.err.println("Truck run diesel");
    }

    void start() {
        System.out.println("Truck start by keys");
    }

}

public class Abstraction2 {
    public static void main(String[] args) {
        Bike B1 = new Bike();
        Truck T1 = new Truck();
        B1.fuel();
        B1.start();
        T1.fuel();

        T1.start();
    }
}
