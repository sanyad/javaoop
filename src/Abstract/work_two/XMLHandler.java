package Abstract.work_two;

public class XMLHandler extends AbstractHandler {
    private final String FORMAT = "XML";

    @Override
    void open() {
        System.out.printf("Open %s", FORMAT);
    }

    @Override
    void create() {
        System.out.printf("Open %s", FORMAT);
    }

    @Override
    void change() {
        System.out.printf("Open %s", FORMAT);
    }

    @Override
    void save() {
        System.out.printf("Open %s", FORMAT);
    }
}
