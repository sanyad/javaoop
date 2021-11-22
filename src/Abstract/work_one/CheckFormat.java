package Abstract.work_one;

import Abstract.work_two.AbstractHandler;
import Abstract.work_two.DOCHandler;
import Abstract.work_two.TXTHandler;
import Abstract.work_two.XMLHandler;

public class CheckFormat {
    private final String TXT = "TXT";
    private final String XML = "XML";
    private final String DOC = "DOC";

    public CheckFormat(String format) {
        if (format.toUpperCase().equals(this.TXT)) {
            AbstractHandler file = new TXTHandler();
        }

        if (format.toUpperCase().equals(this.XML)) {
            AbstractHandler file = new XMLHandler();
        }

        if (format.toUpperCase().equals(this.DOC)) {
            AbstractHandler file = new DOCHandler();
        }
    }
}
