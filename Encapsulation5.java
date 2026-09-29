class Rectangle {
    private int length;
    private int breadth;

    void setlength(int length) {
        this.length = length;
    }

    void setbreadth(int breadth) {
        this.breadth = breadth;
    }

    int getlength() {
        return length;
    }

    int getbreadth() {
        return breadth;
    }

    int getarea() {
        return length * breadth;
    }
}

public class Encapsulation5 {
    public static void main(String[] args) {
        Rectangle R1 = new Rectangle();
        R1.setlength(5);
        R1.setbreadth(6);
        System.out.println("Recatangle length :" + R1.getlength());
        System.out.println("Rectangle breadth:" + R1.getbreadth());
        System.out.println("Recatangle area :" + R1.getarea());
    }
}
