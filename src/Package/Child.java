package Package;

import Package.ConsoleColors.ConsoleColors;

public class Child extends Printer {
    @Override
    public void print(String value) {
        System.out.println(ConsoleColors.BLUE + value + ConsoleColors.RESET);
    }
}
