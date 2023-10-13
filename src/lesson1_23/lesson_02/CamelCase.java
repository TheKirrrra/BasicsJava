package lesson1_23.lesson_02;

public class CamelCase {
    public static void main(String[] args) {
        // Однострочный комментарий
        //  Ctrl + / - закомментировать / раскомментировать строку
               /*
        Слеш + звездочка - это многострочный комментарий.
        Ctrl + Y - это удаление строчки
        после "sout" можно использовать новое значение переменной
        int - формат 32 байтов. числа от -2 147 483 648 до 2 147 483 647
        Если добавить в конце числа L, то формат становится Long
         */

      int  myFirstVariable; // Объявление переменной типа int

      int  mySecondVariable = 25; // объявление и инициализация


      myFirstVariable = 1; // Присвоение значения переменной
 //   mySecondVariable = 7;


        System.out.println("Value of int variable " + mySecondVariable);

        mySecondVariable = 999;

        System.out.println(mySecondVariable);

        byte byteVariable = 126;

        System.out.println(byteVariable);

        short shortVar = 32767;
        System.out.println(shortVar);

        long longVariable = 2_100_000_000_000_000L;
        System.out.println("Число типа Long " + longVariable);

        double doubleVariable; // инициализация переменной типа double
        doubleVariable = 10; // автоматическая конвертация в тип int

        System.out.println("Переменная типа double " + doubleVariable);
        doubleVariable = 5.5432;

        System.out.println(doubleVariable);
    }



}
