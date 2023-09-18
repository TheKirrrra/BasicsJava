package homework_05;

public class HomeWork5_task1 {
    public static void main(String[] args) {
        String name = "Mykhailo";
        System.out.println("\n              Task 01" + "\nИмя: " + name);
        System.out.println("Длина имени: " + name.length());
        char firstLetter = name.charAt(0);
        char lastLetter = name.charAt(name.length()-1);
        System.out.println("Первая буква - " + firstLetter + "\nПоследняя буква - " + lastLetter);


        int firstNameLetter = firstLetter;
        int lastNameLetter = lastLetter;

        System.out.println("Десятичный код первой буквы: " + firstNameLetter + "\nДесятичный код последней буквы: " + lastNameLetter);




    }
}
