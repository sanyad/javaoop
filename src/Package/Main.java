package Package;

import Package.one.*;
import Package.three.DocumentWorker;
import Package.two.Plane;
import Package.two.Car;
import Package.two.Vehicle;

public class Main {
    public static void main(String[] args) {
        Printer child = new Child();
        Printer someChild = new SomeChild();
        child.print("Цвет первого наследника");
        someChild.print("Цвет второго наследника");

        System.out.println();
        Pupil badPupil = new BadPupil();
        Pupil excelentPupil = new ExcelentPupil();
        Pupil goodPupil = new GoodPupil();
        ClassRoom classRoom = new ClassRoom(excelentPupil);
        ClassRoom classRoom2 = new ClassRoom(excelentPupil, badPupil);
        ClassRoom classRoom3 = new ClassRoom(excelentPupil, badPupil, goodPupil);

        Vehicle plane = new Plane(8000, 500);
        Vehicle car = new Car(180, 4, 300);
        plane.run();
        car.run();

        DocumentWorker doc = new DocumentWorker();
        DocumentWorker pro = new DocumentWorker("pro");
        DocumentWorker exp = new DocumentWorker("exp");
    }
}
