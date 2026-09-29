import java.util.Scanner;

class Vehicle {
    void enginetype() {

    }
}

class Truck extends Vehicle {
    void enginetype() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("truck engine is heavy in power");
    }
}

class Bike extends Vehicle {
    void enginetype() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("bike engine is light in power ");
    }
}

public class Inheritance10 {
    public static void main(String[] args) {
        Truck T1 = new Truck();
        Bike B1 = new Bike();
        T1.enginetype();
        B1.enginetype();
    }

}
