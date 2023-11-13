package homeworks.homework1_23.homework_06;

public class homework06_Task01 {
    public static void main(String[] args) {
        System.out.println((true | false) | (45 < 70) & !(true) ^ (6 == 5));
        System.out.println((true | false) | true & !true ^ false);
        System.out.println((true | false) | true & false ^ false);
        System.out.println((true | false) | false ^ false);
        System.out.println((true | false) | false);
        System.out.println(true | false);
        System.out.println(true);
    }

}
