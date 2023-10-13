package lesson1_23.lesson_13;

import java.util.Random;

public class lesson_13 {
    public static void main(String[] args) {
        printNumbers(10);
// перегрузить метод, в следующем методе написать метод предыдущий с нужными значениями
        // написать метод, который выводит числа от Х до Y
        printNumbers(3, 10);







        sayHello();
        String string = "Java";
        saySomething(string);
// 5 раз распечатать Hello
        System.out.println("Hello");

        char ch = 'A';
        char anotherChar = 'B';
        char anotherChar2 = 'C';

        printDecimalCodeOfChar(anotherChar);
        printDecimalCodeOfChar(ch);
        printDecimalCodeOfChar(anotherChar2);

        int[] array = {2, 47, 85, 29, 90, 377, 0, 47};

        printNumbers(10, "Hello");

        System.out.println();

int[] newArray = new int [10];
        fillArrayWithRandomValues(newArray);
        printArray((newArray));

        int temp = 55;
        changeMe(temp);
        System.out.println(temp);

        changeMe(newArray);
        printArray(newArray);

        int[] third = newArray;
        third[2] = -100000;

        printArray(newArray);

        String strTest = "0";

    } // Methods area

    public static void changeMe(int x) {
        x = 100;
    }
    public static void changeMe(int[] arr) {
        arr[0] = 100;
    }
    public static void fillArrayWithRandomValues(int[] arr) {
        Random random = new Random();
        int bound = 101;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(bound);
        }

    }



    public static void printNumbers(int x, String str) {
        System.out.println(str + " Ура! " + x);

    }


    public static void printNumbers(int x, int y) {

        for (int i = x; i <= y; i++) {
            System.out.println(i + " ");
        }
        System.out.println();

    }

    public static void printArray(int[] array) {
        System.out.println("[");
        for (int i = 0; i <= array.length; i++) {
            System.out.println(array[i] + ((i< array.length - 1) ? ", " : "]\n"));
        }


    }

    public static void printIsNumberPrime(int number) {
        boolean isSimple = true;

        if (number == 1 || number <= 0) isSimple = false;
        if (number % 2 ==0 && number != 2 || number % 3 == 0 && number != 3) {
            isSimple = false;
        }

        for (int j = 5; isSimple && j <= Math.sqrt(number); j = j + 6) {

            if (number % j == 0 || number % (j +2) == 0) {
                isSimple = false;
                break;
            }
        }
        if (isSimple) {
            System.out.println(number + " - простое число");
        } else {
            System.out.println(number + " - Не является простым");
        }



    }


    public static void printNumbers(int n) {
        if (n>0) {
            for (int i= 1; i <= n; i++) {
                System.out.println(i + " ");
            }
        }

    }

public static void printDecimalCodeOfChar(char ch1) {
    System.out.println((int) ch1);
}
    public static void sayHello() {
        // тело метода
        System.out.println("Hello");

    }

    public static void saySomething(String str) { //стринг который указал в выше методах, будет передан сюда,
        // этот метод будет его использовать как str (независимо от его прошлого названия)
        System.out.println(str);
    }

}// End class
