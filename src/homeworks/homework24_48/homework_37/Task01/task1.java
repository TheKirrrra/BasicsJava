package homeworks.homework24_48.homework_37.Task01;

import java.time.LocalDate;
import java.time.LocalTime;

/*
tomorrow и yesterday и проверить находятся ли они до или после сегодняшней
 */
public class task1 {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now(); // Текущая Дата
        LocalDate birthday = LocalDate.of(1993,3,7); // Создать дату, например Ваш день рождения и вывести на экран
        LocalDate date1 = LocalDate.of(2006,6,6); // Создать две даты и проверить на равенство
        LocalDate date2 = LocalDate.of(1999,9,9); // Создать две даты и проверить на равенство
        LocalTime localTime = LocalTime.now();
        LocalTime localTime3 = localTime.plusHours(3);
        LocalDate localDateMinus = localDate.plusWeeks(1);
        LocalDate localDateYearMinus = localDate.minusYears(1);
        LocalDate localDateYearPlus = localDate.plusYears(1);
        LocalDate tomorrow = localDate.plusDays(1);
        LocalDate yesterday = localDate.minusDays(1);




        System.out.println("Текущая Дата: " + localDate);
        System.out.println("Текущий год, месяц день: " + localDate.getYear() + "/" + localDate.getMonth() + "/" + localDate.getDayOfMonth()); // текущий год, месяц и день
        System.out.println("Мой день рождения: " + birthday);
        System.out.println("Сравнение двух дат: " + date1.equals(date2));
        System.out.println("Текущее время: " + localTime);
        System.out.println("Текущее время +3: " + localTime3);
        System.out.println("Дата на неделю позже сегодняшней: " + localDateMinus);
        System.out.println("Дата на год Позже текущей: " + localDateYearPlus);
        System.out.println("Дата на год раньше текущей: " + localDateYearMinus);
        System.out.println("Завтра: " + tomorrow);
        System.out.println("Вчера: " + yesterday);


    }
}
