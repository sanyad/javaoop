package Package;

import Package.ConsoleColors.ConsoleColors;

public class SomeChild extends Printer {
    @Override
    public void print(String value) {
        System.out.println(ConsoleColors.PURPLE + value + ConsoleColors.RESET);
    }
}
