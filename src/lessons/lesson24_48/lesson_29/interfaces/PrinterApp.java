package lessons.lesson24_48.lesson_29.interfaces;

public class PrinterApp {
    public static void main(String[] args) {
        Printable book = new Book("Философия Java", "Б.Эккель");
        Printable journal = new Journal("Cosmopolitan", 154);

        Book book1 = new Book("Мастер и Маргарита", "М.Булгаков");

        book.print();
        journal.print();
        book1.print();

        book.test();
        journal.test();

        Printable.testStatic("Hello");

        Presentation presentation =
                new Presentation("Inheritance" , "Unknown", "Inheritance in OOP", 20);

        presentation.print();
        presentation.colourPrint();
    }
}
