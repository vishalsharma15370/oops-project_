class ComplexNumber {
    double real, imaginary;
    ComplexNumber(double real, double imaginary) {
        this.real = real; this.imaginary = imaginary;
    }
    ComplexNumber add(ComplexNumber other) {
        return new ComplexNumber(real + other.real, imaginary + other.imaginary);
    }
    void display() { System.out.println(real + " + " + imaginary + "i"); }
}
public class Practical5 {
    public static void main(String[] args) {
        ComplexNumber n1 = new ComplexNumber(3, 4);
        ComplexNumber n2 = new ComplexNumber(2, 5);
        ComplexNumber sum = n1.add(n2);
        System.out.print("First number: "); n1.display();
        System.out.print("Second number: "); n2.display();
        System.out.print("Sum: "); sum.display();
    }
}
