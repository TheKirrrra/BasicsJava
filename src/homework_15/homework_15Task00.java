package homework_15;
/*
Написать метод принимающий целое число и проверяющий является ли число простым.
Если является, метод должен вернуть true, не является - false
 */
public class homework_15Task00 {
    public static void main(String[] args) {
        int num = 8;

        boolean isPrime;

        isPrime = isNumberPrime(num);

        System.out.println("Число является простым? -> " + isPrime);
    } //Method Area

    public static boolean isNumberPrime(int x) {
        boolean isPrime = true;
        for (int p = 2; p < x; p++) {

                if (x % p == 0) {
                    isPrime = false;
                }

    } return isPrime;

}//Method Area
}
