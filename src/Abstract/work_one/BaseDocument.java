package Abstract.work_one;

public class BaseDocument extends Document {
    public BaseDocument() {
        openDocument();
        editDocument();
        saveDocument();
    }
    public BaseDocument(String key) {
        if (key.equals("pro")) {
            Document doc = new ProDocument();
        }
        if (key.equals("exp")) {
            Document doc = new ExpDocument();
        }
    }
}
