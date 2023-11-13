package lessons.lesson24_48.lesson_46.sets;

import java.util.*;

public class SetExample {
    public static void main(String[] args) {
        Set<Integer> integers = new HashSet<>(); // пустой. По умолчанию capacity 16, load factor 0.75
        Set<Integer> integers1 = new HashSet<>(32); // принимает capacity
        Set<Integer> integers2 = new HashSet<>(32, 0.8f); // принимает capcity и load factor
        Set<Integer> integers3 = new HashSet<>(integers); // принимает коллекцию. Создает Set из уникальных элементов коллекции

        Set<Integer> set = new HashSet<>(List.of(1,2,3,3,2,1,4,4,5,6,15,8,7));

        System.out.println("hashSet: " + set);

        Set<Integer> linkedSet = new LinkedHashSet<>(List.of(1,2,3,3,2,1,4,4,5,6,15,8,7));

        System.out.println("linkedSet: " + linkedSet);

        Set<Integer> treeSet = new TreeSet<>(List.of(1,2,3,3,2,1,4,4,5,6,15,8,7));
        System.out.println("treeSet: " + treeSet);

        treeSet = new TreeSet<>(Comparator.reverseOrder());
        treeSet.addAll(List.of(1,2,3,3,2,1,4,4,5,6,15,8,7));
        System.out.println("treeSet reversed: " + treeSet);

        Set<Integer> reversedSortedSet = new TreeSet<>((i1, i2) -> i2.compareTo(i1));
        reversedSortedSet.addAll(List.of(1,2,3,3,2,1,4,4,5,6,15,8,7));

        System.out.println("reversedSortedSet: " + reversedSortedSet);

        System.out.println("==============UniqueSet===============");

        List<Integer> integerList = new ArrayList<>(List.of(1,2,3,3,2,1,4,4,5,6,15,8,7));
        List<Integer> uniqueList = getUnique(integerList);
        System.out.println("uniqueList: " + uniqueList);

        System.out.println("==========ReversedUniqueSet===========");

        List<Integer> uniqueReversedList = getReversedUnique(integerList);
        System.out.println("uniqueReversedList: " + uniqueReversedList);



    }
    public static <T> List<T> getUnique(List <T> list1) {
        Set<T> result = new HashSet<>(list1);
        return new ArrayList<>(result);
    }
//    public static <T> List<T> getReversedUnique(List <T> list1) {
//        Set<T> uniqueSet = new HashSet<>(list1);
//        List<T> result = new ArrayList<>(uniqueSet);
//        Collections.reverse(result);
//        return result;
//    }
    public static List<Integer> getReversedUnique(List <Integer> list1) {
        Set<Integer> result = new TreeSet<>((i1, i2) -> i2.compareTo(i1));
        result.addAll(list1);
        return new ArrayList<>(result);
    }

}
