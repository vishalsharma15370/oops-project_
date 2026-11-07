class Student {
    int rollNo;
    String name;
    int marks1, marks2, marks3;

    Student(int rollNo, String name, int marks1, int marks2, int marks3) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks1 = marks1;
        this.marks2 = marks2;
        this.marks3 = marks3;
    }
    int totalMarks() { return marks1 + marks2 + marks3; }
    double percentage() { return totalMarks() / 3.0; }

    void display() {
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Total: " + totalMarks());
        System.out.printf("Percentage: %.2f%%%n", percentage());
        System.out.println("--------------------");
    }
}
public class Practical1 {
    public static void main(String[] args) {
        Student s1 = new Student(1, "Aman", 85, 90, 88);
        Student s2 = new Student(2, "Riya", 78, 82, 80);
        Student s3 = new Student(3, "Karan", 92, 89, 95);
        s1.display(); s2.display(); s3.display();
    }
}
