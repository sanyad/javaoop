package Abstract.work_two;

public class AbstractHandler {
    void open() {}
    void create() {}
    void change() {}
    void save() {}

    public AbstractHandler() {
        open();
        System.out.println();
        create();
        System.out.println();
        change();
        System.out.println();
        save();
    }
}
