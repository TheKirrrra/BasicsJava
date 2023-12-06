package homeworks.homework49_.homework_55;

/*Дан список сотрудников (Employee) с полями name, department, salary.
        Используя Stream API, сгруппируйте сотрудников по отделам*/

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Task1 {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>(List.of(
                new Employee("Petr", "IT",  2500),
                new Employee("Silvia","IT", 2200),
                new Employee("Stefan",  "IT",3000),
                new Employee("Olivia",  "Management", 2700),
                new Employee("Sebastian", "Management", 2500),
                new Employee("Hanna", "Cleaning", 2500),
                new Employee("John",  "IT", 1900)
        ));

//        Map<String, List<lessons.lesson49_.lesson_55.Employee>> map1 = employees.stream()
//                .collect(Collectors.groupingBy(Employee::getDepartment));
//        System.out.println(map1);

    }
}
