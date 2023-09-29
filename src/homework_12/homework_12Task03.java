package homework_12;
/*
Написать программу, выводящую на экран треугольник, состоящий из цифр от 1 до 6 такого вида:
 */
public class homework_12Task03 {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6};
        for (int index : nums) {

            for (int l = 1; l < index; l++) {
                System.out.print(l);
            }System.out.println(index);
        }

        }
    }
