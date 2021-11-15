package Book;

public class Content {
    String text = "Content";

    public static void main(String[] args) {
        show();
    }

    static void show() {
        Book book = new Book(new Author().text, new Title().text, new Content().text);
        book.getBook();
    }
}
