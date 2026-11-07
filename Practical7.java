class Demo {
    Demo() { System.out.println("Object constructed"); }
    void useObject() { System.out.println("Object is being used"); }
}
public class Practical7 {
    public static void main(String[] args) {
        Demo object = new Demo();
        object.useObject();
        object = null;
        System.out.println("Reference removed; object may be garbage collected.");
        System.gc();
        System.out.println("End of main method");
        System.out.println("Garbage collection is not guaranteed to happen immediately.");
    }
}
