package lessons.lesson24_48.lesson_29.interfaces;

public class Book implements Printable {

    String title;
    String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    @Override
    public void print() {
        System.out.printf("Book %s (%s)\n", title, author);
    }
}
