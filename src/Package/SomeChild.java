package Package;

public class SomeChild extends Printer {
    @Override
    public void print(String value) {
        System.out.println("SomeChild green, " + value);
    }
}
