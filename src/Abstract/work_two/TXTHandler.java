package Abstract.work_two;

public class TXTHandler extends AbstractHandler {
    private final String FORMAT = "TXT";

    @Override
    void open() {
        System.out.printf("Open %s", FORMAT);
    }

    @Override
    void create() {
        System.out.printf("Create %s", FORMAT);
    }

    @Override
    void change() {
         System.out.printf("Change %s", FORMAT);
    }

    @Override
    void save() {
         System.out.printf("Save %s", FORMAT);
    }
}
