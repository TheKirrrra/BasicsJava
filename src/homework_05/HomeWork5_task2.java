package homework_05;

public class HomeWork5_task2 {
    public static void main(String[] args) {
        String str1 = "Java ";
        String str2 = "is ";
        String str3 = "a ";
        String str4 = "powerful ";
        String str5 = "language ";
        System.out.println("\n              Task 02" + "\n" + str1 + str2 + str3 + str4 + str5);
        String concatStr1 = str1 + str2 + str3 + str4 + str5;
        System.out.println(concatStr1);
        String concatStr2 = String.join ( "", str1,str2,str3,str4,str5);
        System.out.println(concatStr2);
        System.out.println("Количество символов в предложении: " + concatStr1.length());
        String replStr = concatStr2.replace ( "powerful", "super");
        System.out.println("Замена 4-ого слова: " + replStr);
        System.out.println("Если ли слово age в result? - " + replStr.contains("age"));





    }





}
