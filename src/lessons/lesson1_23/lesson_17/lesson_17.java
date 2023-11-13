package lessons.lesson1_23.lesson_17;

public class lesson_17 {
    public static void main(String[] args) {
        ClassCat cat = new ClassCat(); // создаем объект класса ClassCat

        cat.sayMeow(); // Вызываем метод sayMeow у объекта
        cat.run();
        cat.sleep();

        String catName = cat.name;
        String catColor = cat.color;
        int catAge = cat.age;
        System.out.println(catName);
        System.out.println(catColor);
        System.out.println(catAge);
        System.out.println("Имя " + catName);
        System.out.println("Возраст " + cat.age);
        System.out.println("Цвет " + cat.color);


        System.out.println("=====================================");
        // Был создан новый объект класса
        // Имя (строка) которая была передана в конструктор
        // было присвоено полю name
        ClassCat cat1 = new ClassCat( "Max");
        System.out.println("Имя cat1 " + cat1.name);
        System.out.println("Возраст " + cat1.age);
        System.out.println("Цвет " + cat1.color);
        cat1.sayMeow();
        cat1.sleep();
        cat1.whoAmI();

        System.out.println("=====================================");
        ClassCat cat2 = new ClassCat("Soso", "Black");
        System.out.println("Имя cat2 " + cat2.name);
        System.out.println("Возраст " + cat2.age);
        System.out.println("Цвет " + cat2.color);
        cat2.sleep();
        cat2.run();
        cat2.whoAmI();

        System.out.println("=====================================");
        ClassCat cat3 = new ClassCat("Pavel", "Orange", 7);
        System.out.println("Имя cat3 " + cat3.name);
        System.out.println("Возраст " + cat3.age);
        System.out.println("Цвет " + cat3.color);
        cat3.sayMeow();
        cat3.run();
        cat3.whoAmI();



    }
}
