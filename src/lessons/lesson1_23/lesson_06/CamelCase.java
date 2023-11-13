package lessons.lesson1_23.lesson_06;

public class CamelCase {
    public static void main(String[] args) {
        int x = 10;
        int y = 5;

        boolean bol1 = true;
        bol1 = false;

        bol1 = (x == y);// X равен Y -> true / false, (10 равно 5) -> false
        System.out.println(bol1);

        boolean b1 = x != y; // X не равно Y / (10 не равно 5) -> true
        System.out.println(b1);

        boolean b2 = x > y;
        System.out.println(b2);

        boolean b3 = x < y;
        System.out.println(b3);

        boolean b6 = !(4 == 5);

        boolean b7 = true & true;

        b7 = (2 < 5) & (11 == 10); // И
        System.out.println(b7);
        System.out.println(b6);

        boolean b8 = true | false;
        System.out.println("b8-" + b8);

        boolean b9 = false ^ true; // Или
        System.out.println(b9);

        boolean b10 = true && false;
        System.out.println(b10);
        b10 = true && true;
        System.out.println(b10);

        int a = 0;
        int b = 10;
        // int c;
        //c = b / ;

        boolean b11 = (a != 0) && (b / a > 4);
        System.out.println(b11);
        System.out.println(true ^ true & false); // очередность
        System.out.println(true ^ false);
        System.out.println(true);
        System.out.println("++++++++++");

        System.out.println(true ^ true && false);
        System.out.println(false && false);
        System.out.println(false);

        System.out.println("++++++++++");
        boolean aa = true;
        boolean bb = false;
        int cc = 25;
        int qq = 2;
        System.out.println(aa | bb | (cc < 100) & !aa ^ (qq ==5));
        System.out.println((true | false) | true & !true ^ (false));
        System.out.println((true | false) | false ^ false);
        System.out.println(true | false | false);
        System.out.println(true | false);
        System.out.println(true);



    }
}
