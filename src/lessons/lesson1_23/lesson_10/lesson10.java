package lessons.lesson1_23.lesson_10;

public class lesson10 {
    public static void main(String[] args) {
        {
    }

 /*   int x = 0;

        while(x <=21)

    {
        if (x != 0 && x % 2 == 0) {
            System.out.println(x + "; ");
        }
        x++;
    }
        System.out.println("i после цикла = "+x);

        do{
            System.out.println("asda");
        } while

  */

        int x = 10;
        int y = 0; // колво выводов
        int sum = 0;

        while (x<=21)

        {
            if (x % 2 == 1) {
                System.out.println(x + "; ");
                y = y + 1;
                sum = sum + x;
            }
            x++;

        }
        System.out.println("количество цифр: " + y);
        System.out.println("сумма цифр: " + sum);
        System.out.println("среднее арифметичесоке: " + sum/y);

}
}
