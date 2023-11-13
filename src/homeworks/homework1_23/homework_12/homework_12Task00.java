package homeworks.homework1_23.homework_12;

import java.util.Random;

/*Заполните массив 20 случайными целыми числами. Программа должна вывести на экран массив, количество четных чисел в массиве и сумму всех четных чисел.

 */
public class homework_12Task00 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] nums = new int[20];
        System.out.println("Длина массива: " + nums.length);
        int index = 0;
        int sum = 0;
        for (int number : nums) {
            nums[number] = random.nextInt(51)+10;
            if (nums[number] % 2 == 0) {
                sum = sum + nums[number];
                System.out.print(nums[number] + ", ");
            }
        }
        System.out.println("\nСумма четных чисел: " + sum);
    }
}
