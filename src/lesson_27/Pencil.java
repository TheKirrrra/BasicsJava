package lesson_27;

public class Pencil extends Pen{
    @Override
    public void draw(String figure) {
        System.out.println("Рисую: " + figure + " карандашом");
    }
}
