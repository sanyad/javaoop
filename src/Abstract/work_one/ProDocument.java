package Abstract.work_one;

public class ProDocument extends BaseDocument {
    @Override
    public void editDocument() {
        System.out.println("Документ отредактирован");
    }

    @Override
    public void saveDocument() {
        System.out.println("Документ сохранен в старом формате, сохранение в остальных форматах доступно в версии Эксперт");
    }
}
