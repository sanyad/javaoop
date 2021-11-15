package Book;

public class Book {

    private String author;
    private String title;
    private String content;

    public Book(String author, String title, String content) {
        this.author = author;
        this.title = title;
        this.content = content;
    }

    public static void main(String[] args) {
    }

    public void getBook() {
        System.out.printf("Автор %s, название книги - %s, описание - %s", author, title, content);
    }
}
