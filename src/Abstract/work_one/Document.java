package Abstract.work_one;


abstract public class Document {
    public void openDocument() {
        System.out.println("Документ открыт");
    }
    public void editDocument() {
        System.out.println("Редактирование документа доступно в версии Про");
    }
    public void saveDocument() {
        System.out.println("Сохранение документа доступно в версии Про");
    }
}
