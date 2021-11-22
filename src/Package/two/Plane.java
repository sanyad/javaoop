package Package.two;

public class Plane extends Vehicle {
    private int height_plane;
    private int passengers;

    public Plane(int height_plane, int passengers, int price) {
        this.price = price;
        this.height_plane = height_plane;
        this.passengers = passengers;
        run();
    }

    public Plane(int height_plane, int passengers, int price, int speed) {
        this.price = price;
        this.speed = speed;
        this.height_plane = height_plane;
        this.passengers = passengers;
        run();
    }

    public void run() {
        System.out.printf("Высота %d", height_plane);
        System.out.printf("Количество пассажиров %d", passengers);
        System.out.printf("Цена %d", this.price);
        System.out.printf("Скорость %d", this.speed);
        System.out.printf("Год выпуска %d", this.year_of_issue);
    }
}
