package lessons.lesson24_48.lesson_47.enumSet;

import java.util.EnumSet;
import java.util.Set;

public class EnumSetExample {
    public static void main(String[] args) {
        Set<Day> days = EnumSet.allOf(Day.class);
        System.out.println("Дни: " + days);

        Set<Day> weekend = EnumSet.of(Day.SATURDAY, Day.SUNDAY);
        System.out.println("Выходные: " + weekend);

        Set<Day> workDays = EnumSet.range(Day.MONDAY,Day.FRIDAY);
        System.out.println("Рабочие дни: " + workDays);

        EnumSet<Day> week = EnumSet.copyOf(workDays);
        week.addAll(weekend);
        System.out.println(week);

        days.remove(Day.MONDAY);
        System.out.println(days);
    }
}
