package lessons.lesson24_48.lesson_47.maps;

import java.util.*;

public class MapsExample {
    public static void main(String[] args) {
        Map<Integer, String> oldTable = new Hashtable<>();// устаревшее, работало в многопоточной среде
        Map<Integer, String> map = new HashMap<>();

        map.put(1, "Hello");
        map.put(2, "Java");
        map.put(3, "World");

        Map<Integer, String> map1 = new HashMap<>();
        map1.put(2, "Python");
        map1.put(4, "Orange");

        System.out.println(map);

        map.putAll(map1);//питон(мэп1) перешипет джаву

        System.out.println(map);

        System.out.println("containsKey(8)" + map.containsKey(8));
        System.out.println("containsValue - Test: " + map.containsValue("test"));

        System.out.println("map.get(1)" + map.get(1));
        System.out.println("map.get(8)" + map.get(8));

        String value = map.getOrDefault(8, "Default value"); // если по ключу есть что-то будет оно, если его нет, будет defaultValue

        System.out.println("map: " + map);

        System.out.println(map.remove(8));
        System.out.println(map.remove(4));

        System.out.println("map: " + map);

        System.out.println("map.size(): " + map.size());

        Collection<String> strings = map.values();
        System.out.println("map values() " + strings);

        Set<Integer> keys = map.keySet();
        System.out.println("map.keySet(): " + keys);


        Set<Map.Entry<Integer, String>> setEntry = map.entrySet();
        System.out.println("SetEntry: " + setEntry);
        System.out.println("\n================================\n");

        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println("entry.getKey(): " + entry.getKey());
            System.out.println("entry.getValue(): " + entry.getValue());
            if (entry.getKey().equals(1)) entry.setValue("Red");
        }

        map.put(9, "Car");
        System.out.println(map.replace(9, "Replace"));
        System.out.println(map.replace(9, "Replace", "newValue"));

        System.out.println("\n====================\n");

        map.forEach((k,v) -> System.out.println("Key: " + k + "; Value: " + v));

        }

    }

