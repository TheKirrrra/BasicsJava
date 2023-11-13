package homeworks.homework1_23.homework_03;

public class HomeWork03 {
    public static void main(String[] args) {

        int[] nums1 = {0,1,2,3,4,5,6,7,8,9};

        int result1 = 0;

        for (int m : nums1)         {

            result1 += m;

        }
        System.out.printf("\n        Задание 1:\nСреднее число: " + (double) result1 / (double) nums1.length);


        int priceA = 1000; // Цена первого товара 1000 евро
        int priceB = 500; // Цена второго товара 500 евро
        double discount = 0.10; // Скидка 10%

        double priceABdiscount = priceA + priceB - (priceA + priceB) * discount;

        System.out.println("\n\n        Задание 2:\nЦена товара со скидкой: " + priceABdiscount + "\nРазмер скидки: " + (priceA + priceB) * discount);

        /*int mon, tue, wed, thu, fri, sat, sun;

        mon = 25;
        tue = 26;
        wed = 29;
        thu = 30;
        fri = 30;
        sat = 29;
        sun = 20;
        */
        int[] nums3 = {25, 26, 29, 30, 30, 29, 20}; // Коллекция из семи чисел (температура дней недели)

        int result3 = 0;

        for (int m : nums3) // m - является переменной, которой мы даём нашу коллекцию в использование
             {

            result3 += m; // То с чем мы будем работать

        }
        //nums.length использует длину массива, благодаря ему нам не придется считать сколько чисел было использовано в арифметической прогрессии
        System.out.println("\n        Задание 3:\nСредняя температура равна: " + result3 / nums3.length);


        int perm = 2;
        int perm2 = 3;
        System.out.println("\n        Задание 4: ");
        for (int p = 1; p <= perm; p++)
        /* При такой формуле, мы можем заменять переменную perm на любое число и приходить к нужному решению
            возможно всё пойдет плохо, если число будет отрицательным, тогда нужно возводить число в модуль
            либо делать проверку на отрицание.
            */
            System.out.println("\nЦифра положительного остатка при делении на 2: " + p % perm);

        for (int p = -1; p >= -perm; p--)
            System.out.println("\nЦифра отрицательного остатка при делении на 2: " + p % perm);

        for (int o = 1; o <= perm2; o++)
            System.out.println("\nЦифра положительного остатка при делении на 3: " + o % perm2);

        for (int o = -1; o >= -perm2; o--)
            System.out.println("\nЦифра отрицательного остатка при делении на 3: " + o % perm2);
        int x = 3;
        System.out.println("\n        Задание 5: \nПри х равен 3 в уровнении (x += x++) ответ будет: " + (x += x++));


    }



}
