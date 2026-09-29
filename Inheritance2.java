
class Vehicle {
    void display() {
        System.out.println("vehicle run on differnt fuels like petrol and doesel");
    }
}

class Car extends Vehicle {
    void display2() {
        System.out.println("This is a car");
    }
}

public class Inheritance2 {
    public static void main(String[] args) {
        Vehicle V1 = new Vehicle();
        V1.display();
        Car C1 = new Car();
        C1.display2();
    }
}
