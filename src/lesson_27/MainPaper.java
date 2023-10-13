package lesson_27;

public class MainPaper {
    public static void main(String[] args) {
        Brush brush = new Brush();
        Pencil pencil = new Pencil();

        Paper paper = new Paper();

        paper.drawFigure("Квадрат", brush);
        paper.drawFigure("Овал", pencil);
        }
    }
