package Package;

public class Child extends Printer {
    @Override
    public void print(String value) {
        System.out.println("Child blue, " + value);
    }
}
