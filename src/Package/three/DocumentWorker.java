package Package.three;

public class DocumentWorker {
    public void openDocument() {
        System.out.println("Документ открыт");
    }
    public void editDocument() {
        System.out.println("Редактирование документа доступно в версии Про");
    }
    public void saveDocument() {
        System.out.println("Сохранение документа доступно в версии Про");
    }

    public DocumentWorker() {
        run();
        System.out.println();
    }

    public DocumentWorker(String key) {
        if (key.equals("pro")) {
            DocumentWorker doc = new ProDocumentWorker();
        }
        if (key.equals("exp")) {
            DocumentWorker doc = new ExpertDocumentWorker();
        }
    }

    public void run() {
        openDocument();
        editDocument();
        saveDocument();
    }
}
