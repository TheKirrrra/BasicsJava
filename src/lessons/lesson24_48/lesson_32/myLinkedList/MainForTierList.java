package lessons.lesson24_48.lesson_32.myLinkedList;

public class MainForTierList {
    public static void main(String[] args) {
        MyLinkedList<String> list = new MyLinkedList<>();

        list.add("1");
        list.add("2");
        System.out.println(list);
        list.addFirst("0");
        System.out.println(list);
        System.out.println(list.lastIndexOf("1"));


    }
}
