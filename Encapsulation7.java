class Student {

    private int marks;

    void setMarks(int marks) {
        this.marks = marks;
    }

    int getMarks() {
        return marks;
    }

    String getGrade() {

        if (marks >= 90) {
            return "A";
        } else if (marks >= 75) {
            return "B";
        } else if (marks >= 50) {
            return "C";
        } else {
            return "Fail";
        }
    }
}

public class Encapsulation7 {

    public static void main(String[] args) {

        Student S1 = new Student();

        S1.setMarks(80);

        System.out.println("Marks: " + S1.getMarks());
        System.out.println("Grade: " + S1.getGrade());
    }
}