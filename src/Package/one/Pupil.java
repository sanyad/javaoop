package Package.one;

public class Pupil {
    public void study() {
        System.out.println("Study");
    }
    public void read() {
        System.out.println("Read");
    }
    public void write() {
        System.out.println("Write");
    }
    public void relax() {
        System.out.println("Relax");
    }

    public void run(Pupil ppl) {
        System.out.printf("%s имеет возможности:", ppl.getClass().getSimpleName());
        System.out.println();
        study();
        read();
        write();
        relax();
        System.out.println();
    }
}
