package Rectangle;

import java.util.Scanner;

public class Rectangle {
    private double side1;
    private double side2;

    public static void main(String[] args) {
        run();
    }

    static void run() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите ширину:");
        Rectangle rec = new Rectangle();
        rec.setSide1(sc.nextDouble());
        System.out.println("Введите высоту:");
        rec.setSide2(sc.nextDouble());

        rec.areaCalculator(rec.side1, rec.side2);
        rec.perimeterCalculator(rec.side1, rec.side2);
        System.out.printf("Периметр равен %.2f, площадь равна - %.2f", rec.perimeterCalculator(rec.side1, rec.side2), rec.areaCalculator(rec.side1, rec.side2));
    }

    public double setSide1(double side) {
        return this.side1 = side;
    }

    public double getSide1() {
        return this.side1;
    }

    public double setSide2(double side) {
        return this.side2 = side;
    }

    public double getSide2() {
        return this.side2;
    }

    public double areaCalculator(double side1, double side2) {
        return side1 * side2;
    }

    public double perimeterCalculator(double side1, double side2) {
        return (side1 + side2) * 2;
    }
}
