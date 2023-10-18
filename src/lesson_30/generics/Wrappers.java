package lesson_30.generics;

public class Wrappers {
    /*
    Byte -> byte
    Short ->
    Integer -> int
    Long ->
    Float ->
    Double ->
    Character -> char
    Boolean -> boolean

     */

    public static void main(String[] args) {
        Integer x = 5;
        System.out.println(x);
        int intValue = x;
        System.out.println(intValue);
        Double d = 15.0;
        System.out.println(d);

        int x1 = Integer.valueOf("12");
        System.out.println(x1 + 5);
        Double.valueOf("15.5");

        Integer test = Integer.parseInt("16");
        System.out.println(test + 10);

        double testD = Double.parseDouble("12");
        System.out.println(testD + 4);

        Integer a = 127;
        Integer b = 127;

        System.out.println(a == b);

    }
}
