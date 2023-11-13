package lessons.lesson1_23.lesson_15;

public class lesson_15 {
    public static void main(String[] args) {

        int var = 5;
        var = 10 + 5;

        int[] numbers = {4,5,6,7,8,3,0,0,0,0,3,22,1};


        int sumAB = calculateSum(10,5);
        System.out.println("sumAB: " + sumAB);

        printSum(10,5);

        int pow = 4;
        double var1 = powTwo(pow);
        System.out.println("2 в степени " + pow + " = " + var1);
        double powerNum;
        powerNum = powNum(pow);
        System.out.println(powerNum);

        int searchMe = 3;

        boolean isNumberInArray = numberIsHere(numbers, searchMe);


        int x;

        x = numberIsInMassive(numbers,searchMe);


        System.out.println("Где в массиве число "+ searchMe +" ? "+x);

        int minNumber = minArray(numbers);
        System.out.println("Минимальное значение из массива numbers -> " + minNumber);


    } // Methods Area

    public static void printSum(int a, int b) {

        int sum = a + b;
        System.out.println(sum);
    } // Methods area

    public static int calculateSum(int a, int b) {
        int sum = a + b;
        return sum;
    } // Methods area
    public static double powTwo(int x) {

        boolean isPositive = x >= 0;

        if (x < 0) {
            x *= -1;
        }
        int result = 1;

        for (int i = 1; i <= x; i++) {
            result *= 2;
        }

        if (isPositive) {
            return (result);
 //           System.out.println(result);
        } else {
            return ((double) 1 / result);
  //          System.out.println((double) 1 / result);
   //         System.out.printf("1/%d\n", result);
        }

    }//Method Area

    public static double powNum(int x) {
       return x * x;
    }//Method Area
    public static int minArray(int[] ints) {
        if (ints.length < 1) {
        return Integer.MIN_VALUE;
        }
        int min = ints[0];
        for (int i = 1; i < ints.length; i++) {
            if (ints[i] < min) {
                min = ints[i];
            }
        }
        return min;
    } //Method Area

    public static boolean numberIsHere (int[] array, int x) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == x) {
                return true;
            }

        } return false;
    }

    public static int numberIsInMassive (int[] array, int x) {
        int result = -1;

        for (int i = 0; i < array.length; i++) {
                if (array[i] == x) {
                    result = i;
                }
            }
       return result;
    }




}
