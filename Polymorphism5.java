class Temperature {
    void conversion(double c) {
        System.out.println("Celsius to farhenheit :" + ((c * 9 / 5)) + 32);
    }

    void conversion(int f) {
        System.out.println("Farhenheit to celsius:" + (f - 32) * 5 / 9);
    }
}

public class Polymorphism5 {
    public static void main(String[] args) {
        Temperature T1 = new Temperature();
        T1.conversion(5);
        T1.conversion(222);
    }

}
