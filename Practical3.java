interface Printable { void print(); }
interface Scannable { void scan(); }

class AllInOnePrinter implements Printable, Scannable {
    public void print() { System.out.println("Printing document"); }
    public void scan() { System.out.println("Scanning document"); }
}
class Machine {
    void powerOn() { System.out.println("Machine is powered on"); }
}
interface Connectable { void connect(); }

class SmartPrinter extends Machine implements Printable, Connectable {
    public void print() { System.out.println("Smart printer is printing"); }
    public void connect() { System.out.println("Connected to Wi-Fi"); }
}
public class Practical3 {
    public static void main(String[] args) {
        AllInOnePrinter printer = new AllInOnePrinter();
        printer.print(); printer.scan();

        SmartPrinter smartPrinter = new SmartPrinter();
        smartPrinter.powerOn(); smartPrinter.print(); smartPrinter.connect();
    }
}
