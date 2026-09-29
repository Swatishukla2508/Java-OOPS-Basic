class Student {
    private String name;
    private int rollno;
    private int marks;

    void setName(String name) {
        this.name = name;
    }

    void setrollno(int rollno) {
        this.rollno = rollno;
    }

    void setclass(int marks) {
        this.marks = marks;
    }

    String getname() {
        return name;
    }

    int getrollno() {
        return rollno;
    }

    int getmarks() {
        return marks;
    }
}

public class Encapsulation1 {
    public static void main(String[] args) {
        Student S1 = new Student();
        S1.setName("Swati");
        S1.setrollno(163);
        S1.setclass(2);

        System.out.println("Name of student" + S1.getname());
        System.out.println("Student roll no" + S1.getrollno());
        System.out.println("Student marks" + S1.getmarks());
    }
}
