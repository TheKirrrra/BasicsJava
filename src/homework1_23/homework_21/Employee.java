package homework1_23.homework_21;
/*
Написать класс Employee (Работник) У него должны быть поля имя, возраст, зарплата

Инкапсулировать класс. Написать метод info() выводящий информацию о работнике.
 */
public class Employee {

    private String name = "Incognito";

    private final int id; //Идентификатор рабочего

    private int age = 18; // минимальный возраст для работы.

    private int salary = 450; // минимальная зарплата 450.

    private static int counter; //подсчет количества рабочих, отсчет начинается с 0

    public Employee(String name, int age, int salary) {
        setName(name);
        setAge(age);
        setSalary(salary);
        this.id = counter++;
    }

    public void setName (String newName) {
        if (newName != null && !newName.isEmpty()) {
            this.name = newName;
        }
    }

    public void setAge (int newAge) {
        if (newAge >= 18 && newAge <= 65) { //65 лет = возраст пенсии (условный)
            this.age = newAge;
        }
    }

    public void setSalary (int newSalary) {
        if (newSalary >= 450) {
            this.salary = newSalary;
        }
    }

    public String info() {
        return "ID работника: " + id + " Имя работника - " + this.name + "\nВозраст работника - " + this.age + "\nЗарплата работника - " + this.salary;
    }


}
