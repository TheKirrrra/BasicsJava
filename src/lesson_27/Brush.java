package lesson_27;

public class Brush extends Pen{

    @Override
    public void draw(String figure) {
        System.out.println("Рисую: " + figure + " кистью");
    }
}
