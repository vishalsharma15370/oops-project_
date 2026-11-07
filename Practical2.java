class Vehicle {
    void start() { System.out.println("Vehicle starts"); }
}
class Car extends Vehicle {
    void drive() { System.out.println("Car is driving"); }
}
class Person {
    void showPerson() { System.out.println("I am a person"); }
}
class Employee extends Person {
    void showEmployee() { System.out.println("I am an employee"); }
}
class Manager extends Employee {
    void manage() { System.out.println("Manager manages the team"); }
}
class Shape {
    void showShape() { System.out.println("This is a shape"); }
}
class Circle extends Shape {
    void area(double r) { System.out.printf("Circle area: %.2f%n", 3.14 * r * r); }
}
class Rectangle extends Shape {
    void area(double l, double b) { System.out.println("Rectangle area: " + (l * b)); }
}
public class Practical2 {
    public static void main(String[] args) {
        System.out.println("Single Inheritance:");
        Car car = new Car(); car.start(); car.drive();

        System.out.println("\nMultilevel Inheritance:");
        Manager manager = new Manager();
        manager.showPerson(); manager.showEmployee(); manager.manage();

        System.out.println("\nHierarchical Inheritance:");
        Circle circle = new Circle(); circle.showShape(); circle.area(5);
        Rectangle rectangle = new Rectangle(); rectangle.showShape(); rectangle.area(4, 6);
    }
}
