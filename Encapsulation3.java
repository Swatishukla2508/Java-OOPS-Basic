class Car {
    private String brand;
    private double price;
    private int model;

    void setname(String brand) {
        this.brand = brand;
    }

    void setprice(double price) {
        this.price = price;
    }

    void setmodel(int model) {
        this.model = model;
    }

    String getbrand() {
        return brand;
    }

    double getprice() {
        return price;
    }

    int getmodel() {
        return model;
    }
}

public class Encapsulation3 {
    public static void main(String[] args) {
        Car C1 = new Car();
        C1.setmodel(23);
        C1.setname("thar");
        C1.setprice(250000);

        System.out.println("Car model" + C1.getmodel());
        System.out.println("Car brnad" + C1.getbrand());
        System.out.println("Car price" + C1.getprice());
    }

}
