package lessons.lesson49_.lesson_53;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExamples {
    public static void main(String[] args) {
        task1();

        task2();

        task3();

        task4();

        task5();

        task6();

        task10();

    }

    private static void task1() {
        List<Integer> integers = List.of(-1,12,0,4,1,-15,24,0);

//        List<Integer> result = new ArrayList<>();
//
//        for (Integer integer: integers) {
//            if (integer > 0) result.add(integer);
//        }
//        Collections.sort(result);
//        System.out.println(result);

        List<Integer> integerList = integers.stream()//Создание потока на основе элементов коллекции
                .filter(integer -> integer > 0) // фильтрация элементов потока
                .sorted() // сортировка по мере возрастания
                .collect(Collectors.toList()); //Преобразование элементов потока в список (коллекцию)

        System.out.println(integerList);

    }

    private static void task2() {
        List<Cat> cats = getListCats();

        // список кошек, чей вес больше 4 кг

        Stream<Cat> catStream = cats.stream()
                .filter(cat -> cat.getWeight() > 4);

        List<Cat> fatCats = catStream.collect(Collectors.toList());
        System.out.println(fatCats);

    }

    private static void task3() {
        List<Cat> cats = getListCats();

        Stream <Cat> streamCats = cats.stream()
                .filter(cat -> cat.getName().length() > 4);

        List<Cat> longNameCats = streamCats.collect(Collectors.toList());

        System.out.println(longNameCats);
    }

    private static void task4() {
        List<Cat> cats = getListCats();

        List <String> catNames = cats.stream()
                .map(Cat::getName)
                .collect(Collectors.toList());

        System.out.println(catNames);
    }

    private static void task5() {
        List<Cat> cats = getListCats();

        List <String> catNames = cats.stream()
                .filter(cat -> cat.getWeight()>4)
                .map(Cat::getName)
                .collect(Collectors.toList());

        System.out.println(catNames);
    }

    private static void task6() {
        List<Cat> cats = getListCats();

        List <String> catNames = cats.stream()
                .map(Cat::getName)
                .filter(name -> name.length() < 5)
                .collect(Collectors.toList());

        System.out.println(catNames);
    }

    private static void task8() {
        List<Cat> cats = getListCats();

        Stream<Cat> catStream = cats.stream()
                .filter (cat -> cat.getWeight() < 5)
                .peek(cat -> cat.setName(cat.getName() + "_"));

        catStream.forEach(cat -> System.out.println(cat));
    }

    private static void task9() {
        List <Integer> integers = List.of(5,4,14,50,32,24,1000);

        Optional <Integer> max = integers.stream().max(Integer::compareTo);
        Optional <Integer> min = integers.stream().min(Integer::compareTo);
        System.out.println(max.orElse(0));
        System.out.println(min.orElse(0));


    }

    private static void task10() {
        List<Cat> cats = getListCats();

        Optional<String> catOptional = Optional.ofNullable(cats.stream()
                .map(Cat::getName)
                .max((name1, name2) -> Integer.compare(name1.length(), name2.length()))
                .orElse(null));

        System.out.println(catOptional);
    }

    private static List<Cat> getListCats() {
        return List.of(
                new Cat("Bear", 5, "brown"),
                new Cat("Python", 7, "white"),
                new Cat("Tiger", 3, "grey"),
                new Cat("Panda", 4, "black")
        );
    }
}
