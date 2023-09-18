package lesson_03;

public class MathOperations {
    public static void main(String[] args){
        /*

        Байт состоит из 8 битов

        Числа хранятся в двоичной системе.

        2 в разных степенях, начиная с 0-ой степени: 0,1,2,4,8,16,32,64,128,256,512,1024

        В двоичной системе отсчет начинается справа налево

        Если байт расписан как 11101000
        То численное представление будет выглядеть так - 128+64+32+0+8+0+0+0
        А число будет равно - 232

        */

        int a = 20;
        int b = 7;

        int c = a + b; // Summe
        System.out.println("c: " + c);

        // Нельзя написать снова int для нового значения переменной, но можно без названия переменной написать её:

        c = a - b; // dsxbnfybt

        System.out.println("c: " + c);

        c = a * b; // ghjbpdtltybt
        System.out.println("c: " + c);

        System.out.println("Результат умножения a*b: " + a + " * " + b + " = " + c );

        int resultDiv = a / b; // Java даёт ответ сколько целых чисел получится 8/3 = 2

        System.out.println("Результат деления a/b: " + resultDiv);

        int restDiv = a % b; // Java даёт ответ какое число не поделилось 5/10 = 5, 20/7 = 6

        System.out.println("Остаткок деления a/b: " + restDiv);

        restDiv = 9 % 10;

        System.out.println("Остаток деления с результатом 0: " + restDiv);

        float floatVar = 20.0f;

        double doubleVar = 20.0D; // Если стоит в после числа D, то число записано в типе double
        double doubleVar2 = 20.0; // все числа записанные с точкой по умолчанию считаются типом Java
        double doubleSeven = 7.0;

        double resultDoubleDiv = doubleVar / doubleSeven;

        System.out.println("Результат деления с дробными числами с помощью double: " + resultDoubleDiv);

        System.out.printf("Результат деления 20 на 7 равен %f, но не %f", resultDoubleDiv, doubleSeven ); //%f отвечает за переменную

        /* если после % поставить точку и какое-то число
        то будет показано столько знаков после запятой, какое число написано

         */
        System.out.printf("Результат деления 20 на 7 равен %.2f, но не %.1f", resultDoubleDiv, doubleSeven);

        System.out.println("Строка 1\nСтрока 2\nСтрока 3"); // перевод каретки \n

        int intVar1 = 20;
        int intVar2 = 7;

        double resultDoubleDiv1 = (double) intVar1 / (double) intVar2; // если в скобках написать тип, перед переменной, он изменится на этот тип
        System.out.println("Результат после приведения типов: " + resultDoubleDiv1);
    }
}
