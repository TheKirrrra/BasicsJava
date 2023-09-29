package homework_12;

import java.util.Random;

/*
Заполните массив 50 случайными числами от 1 до 100.
Программа должна найти, и вывести на экран все простые числа.
 Посчитайте сколько получилось таких чисел в массиве.
  Простое число - число, которое делится на целое, на 1 и на само себя.

Пример простых чисел: 3, 5, 7, 11, 13 и т.д.
 */
public class homework_12Task02 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] nums = new int[50];
        int sum = 0;

        System.out.println("Длина массива: " + nums.length);
        for (int i = 0; i < nums.length; i++) {
            nums[i] = random.nextInt(101);
            boolean isPrime = true;
            for (int p = 2; p < (nums[i]); p++) {

                if (nums[i] % p == 0) {
                    isPrime = false;
                    break;
                }

            }if (isPrime) {
                sum++;
                System.out.print(nums[i] + ", ");
            }

        }
        System.out.println("\n Сколько простых чисел -> " + sum);

        }
    }

