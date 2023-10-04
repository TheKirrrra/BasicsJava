package lesson_21;

public class StaticBlockDemo {
    private static String[] strings;

    private static int counter = 5;
    private static int[] ints = new int[counter];
    private String title;
    private int capacity;

    {
        System.out.println("NON-static init block!");
        this.title = "String";
        this.capacity = 10;
    }

    static {
        System.out.println("Static init block start!");
        strings = new String[3];
        strings[0] = "Blue";
        strings[1] = "Yellow";
        strings[2] = "Red";

    }

    static {
        System.out.println("Second static init block");
        strings[0] = "Gray";
    }

    public StaticBlockDemo(String title, int capacity) {
        System.out.println("Constructor start!");
        this.title = title;
        this.capacity = capacity;
    }

    public void changeStringsValues(String str1, String str2) {
        strings[0] = str1;
        strings[1] = str2;
    }

    public static void printStrings() {
        for (String str : strings) {
            System.out.print(str + "; ");
        }
        System.out.println();
    }

    public String getTitle() {
        return title;
    }

    public int getCapacity() {
        return capacity;
    }

    public static void main(String[] args) {
        StaticBlockDemo sbd = new StaticBlockDemo("First", 5);
    StaticBlockDemo.printStrings();

    sbd.changeStringsValues("Black", "White");
    StaticBlockDemo.printStrings();

    StaticBlockDemo sbd1 = new StaticBlockDemo("Second", 6);
        StaticBlockDemo.printStrings();
    }
}
