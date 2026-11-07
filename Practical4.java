class Calculator {
    int add(int a, int b) { return a + b; }
    int add(int a, int b, int c) { return a + b + c; }
    double add(double a, double b) { return a + b; }
}
class Employee {
    double calculatePay() { return 20000; }
}
class Developer extends Employee {
    @Override double calculatePay() { return 40000; }
}
class Manager extends Employee {
    @Override double calculatePay() { return 60000; }
}
public class Practical4 {
    public static void main(String[] args) {
        Calculator c = new Calculator();
        System.out.println("add(10, 20): " + c.add(10, 20));
        System.out.println("add(10, 20, 30): " + c.add(10, 20, 30));
        System.out.println("add(2.5, 3.5): " + c.add(2.5, 3.5));

        Employee e = new Developer();
        System.out.println("Developer pay: " + e.calculatePay());
        e = new Manager();
        System.out.println("Manager pay: " + e.calculatePay());
    }
}
