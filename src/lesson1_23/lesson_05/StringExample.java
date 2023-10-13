package lesson1_23.lesson_05;

public class StringExample {
    public static void main(String[] args) {
        String string = "Java"; // объявление и инициализация переменной типа String

        String string1 = new String( "Hello"); // создание новой строки с помощью конструктора класса

        System.out.println(string1);
        // Получаем
        System.out.println(string.length());


 //       int length = string.length();

        System.out.println(string.toUpperCase());
        System.out.println(string);

        string = string.toUpperCase();
        System.out.println("string " + string);

        String stringLower = string.toLowerCase();

        System.out.println("stringUpper - " + stringLower);

        System.out.println("+++++++++++++");

        String str1 = "One";
        String str2 = " ";
        String str3 = "hello";

        // Различные варианты склеивания /  /

        String concatStr = str1 + str2 + str3;
        System.out.println(concatStr);

        String concatStr2 = str1.concat(str2);
        concatStr2 = concatStr2.concat(str3);
        System.out.println(concatStr2);

        // String concatStr3 = String.join ( " ", str1, str2, str3);
        String concatStr3 = String.join ( " - ", str1,str3);
        System.out.println("concatStr3: " + concatStr3);


        int id = 1;
        String string2 = concatStr3 + id;
        System.out.println(string2);

        System.out.println("My age: " + id);

        System.out.println("==============");

        String digits = "0123456789";
        String digits2 = "9876543210";
        System.out.println(digits.length());

        char firstChar = digits.charAt(0);
        char firstChar2 = digits2.charAt(0);
        System.out.println("firstChar: " + firstChar);
        System.out.println("firstChar2: " + firstChar2);

        char lastChar = digits.charAt(digits.length() - 1);
        System.out.println("lastChar: " + lastChar);

        String subString = digits.substring( 2);
        System.out.println(subString);
        System.out.println(digits);
        String subString2 = digits.substring(2,5);
        System.out.println(subString2);

        System.out.println("++++++++++++++++");
        concatStr3 = concatStr3.concat( " One");
        System.out.println(concatStr3);
        System.out.println(concatStr3.concat( "One"));

        String replStr = concatStr3.replace ( "One", "Worlds");
        
        System.out.println(replStr);


    }
}
