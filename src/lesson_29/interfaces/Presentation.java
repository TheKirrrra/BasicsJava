package lesson_29.interfaces;

public class Presentation implements ColorPrintable{
    String title;
    String author;
    String theme;
    int amountPages;

    public Presentation(String title, String author, String theme, int amountPages) {
        this.title = title;
        this.author = author;
        this.theme = theme;
        this.amountPages = amountPages;
    }

    @Override
    public void colourPrint() {
        System.out.println("Отправляю презентацию в типографию!");
        System.out.println("Presentation by " + author + ": title: " + title + "; theme: " + theme);
    }

    @Override
    public void print() {
        System.out.println("Presentation " + title + "(pages:" + amountPages + ")");
    }

    @Override
    public String toString() {
        return "Presentation{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", theme='" + theme + '\'' +
                ", amountPages=" + amountPages +
                '}';
    }
}
