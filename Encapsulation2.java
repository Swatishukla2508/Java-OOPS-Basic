class Employee {
    private String name;
    private double salary;
    private int id;

    void setname(String name) {
        this.name = name;
    }

    void setsalary(double salary) {
        this.salary = salary;
    }

    void setid(int id) {
        this.id = id;
    }

    String getname() {
        return name;
    }

    double getsalary() {
        return salary;
    }

    int getid() {
        return id;
    }
}

public class Encapsulation2 {
    public static void main(String[] args) {
        Employee E1 = new Employee();
        E1.setname("Khushi");
        E1.setsalary(250000);
        E1.setid(001);

        System.out.println("Employee name" + E1.getname());
        System.out.println("Employee salary" + E1.getsalary());
        System.out.println("Employee id" + E1.getid());

    }
}
