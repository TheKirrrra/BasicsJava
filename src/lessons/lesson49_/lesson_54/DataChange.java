package lessons.lesson49_.lesson_54;

import java.util.List;

public class DataChange {
    public static void main(String[] args) {
        task1();
    }

    private static void task1() {
        Shop shop = new Shop("Shop1", List.of("Orange", "Banana", "Apple"));
        Shop shop1 = new Shop("Shop1", List.of("Lime", "Cherry", "Pineapple"));
        Shop shop2 = new Shop("Shop1", List.of("Grape", "Lemon", "Apple"));

        Shop[] shops = new Shop[]{shop, shop1,shop2};



    }
}
