class Student {

    void stdetails(String name) {
        System.out.println("Name :" + name);
    }

    void stdetails(String name, int age) {
        System.out.println("Name :" + name + " Age:" + age);
    }

    void stdetails(String name, int age, String course) {
        System.out.println("Name :" + name + " Age:" + age + " Course :" + course);
    }
}

public class Polymorphism3 {
    public static void main(String[] args) {

        Student S1 = new Student();

        S1.stdetails("Swati");
        S1.stdetails("Swati", 21);
        S1.stdetails("Swati", 21, "BCA");
    }
}
