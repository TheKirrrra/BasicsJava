package homeworks.homework49_.homework_53;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
Дан список Person с полями name, age, city.
 Используйте Stream API для фильтрации людей,
 которые старше определенного возраста и проживают в определенном городе,
а затем соберите их в список.
 */
public class task2 {
    public static void main(String[] args) {
        List<Person> person = List.of(
                new Person("Perun" , 23, "Perunsk"),
                new Person("Zeus" , 43, "Perunsk"),
                new Person("Svarog", 37, "Svarogov"),
                new Person("Gefest", 17, "Svarogov"),
                new Person("Yarilo", 39, "Yarilov"),
                new Person("Ra", 29, "Yarilov"),
                new Person("Veles", 76, "Svarogov"),
                new Person("Boyan", 16, "Svarogov"));

//        List<Person> personList = person.stream()
//                .filter(person1 -> person1.getAge()>30)
//                .filter(person1 -> person1.getCity() == "Svarogov")
//                .collect(Collectors.toList());

        Stream<Person> personStream = person.stream()
                .filter(person1 -> person1.getAge()>30)
                .filter(person1 -> person1.getCity() == "Svarogov");

        List<Person> personList = personStream.collect(Collectors.toList());

        System.out.println(personList);

    }
}
