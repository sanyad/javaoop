package Package.two;

public class Vehicle {
    private int height;
    private int speed;
    private int year;
    private int count;

    public int getCount() {
        return count;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void run() {
        System.out.println(this.height);
        System.out.println(this.speed);
        System.out.println(this.year);
        System.out.println(this.count);
    }
/*
    public Vehicle(int height, int count) {
        this.height = height;
        this.count = count;
    }

    public Vehicle(int height, int count, int speed) {
        this(height, count);
        this.speed = speed;
    }

    public Vehicle(int height, int count, int speed, int year) {
        this(height, count, speed);
        this.year = year;
    }
*/
}
