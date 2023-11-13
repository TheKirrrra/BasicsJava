package lessons.lesson1_23.lesson_21;

public class FinalDemo {

    private final int x;

    private final int[] ints = new int[10];

    private final String name = "Max";

    private int y;

    private double[] doubles;

    public FinalDemo() {
        x = 15;
        ints[0] = 10;
        ints[1] = 100;
        ints[2] = -15;

        name.charAt(0);
    }

    public static void main(String[] args) {

    }
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

}
