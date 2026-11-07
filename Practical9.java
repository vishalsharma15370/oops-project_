class Employee {
    String employeeName;
    double salary;
    static int count = 0;

    Employee() { this("Not assigned", 0.0); }
    Employee(String employeeName, double salary) {
        this.employeeName = employeeName;
        this.salary = salary;
        count++;
    }
    void display() { System.out.println(employeeName + " | Salary: " + salary); }
    static void displayCount() {
        System.out.println("Total employees created: " + count);
    }
}
public class Practical9 {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        Employee e2 = new Employee("Asha", 35000);
        Employee e3 = new Employee("Rahul", 42000);
        e1.display(); e2.display(); e3.display();
        Employee.displayCount();
    }
}
