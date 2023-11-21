package homeworks.homework49_.homework_53;

import java.util.List;
import java.util.stream.Collectors;


/*
Дан список строк.
Используя Stream API, отфильтруйте строки,
которые начинаются на определенную букву (например, "A"),
удалите дубликаты и отсортируйте их в алфавитном порядке.
 */
public class task1 {
    public static void main(String[] args) {


        List<String> strings = List.of
                ("Apple", "Ananas", "apelsin",
                        "Orange", "Lime", "Mandarin", "Apple", "Ananas");

        List<String> stringStream = strings.stream()
                .filter(string -> string.startsWith("A"))
                .distinct()
                .sorted()
                .collect(Collectors.toList());

        System.out.println(stringStream);
    }
}
