class Book {
    String title, author;
    double price;
    Book() { title = "Not assigned"; author = "Not assigned"; price = 0.0; }
    Book(String title, String author, double price) {
        this.title = title; this.author = author; this.price = price;
    }
    Book(Book other) {
        this.title = other.title; this.author = other.author; this.price = other.price;
    }
    void display() { System.out.println(title + " | " + author + " | Rs. " + price); }
}
public class Practical6 {
    public static void main(String[] args) {
        Book b1 = new Book();
        Book b2 = new Book("Java Basics", "James", 450);
        Book b3 = new Book(b2);
        System.out.println("Default constructor:"); b1.display();
        System.out.println("Parameterized constructor:"); b2.display();
        System.out.println("Copy constructor:"); b3.display();
        b3.price = 500;
        System.out.println("After changing copied object:");
        System.out.println("Original:"); b2.display();
        System.out.println("Copy:"); b3.display();
    }
}
