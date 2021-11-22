package Package;

import Package.ConsoleColors.ConsoleColors;

public class Printer {
    public void print(String value) {
        System.out.println(ConsoleColors.CYAN + value + ConsoleColors.RESET);
    }
}
