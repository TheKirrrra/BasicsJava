package lesson_37.javaTimeApi;



import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class TimeApiExample {
    public static void main(String[] args) {

        LocalDate date = LocalDate.now();
        LocalTime time = LocalTime.now();
        LocalDateTime dateTime = LocalDateTime.now();
        ZonedDateTime zonedDateTime = ZonedDateTime.now();

        System.out.println(date);
        System.out.println(time);
        System.out.println(dateTime);
        System.out.println(zonedDateTime);

        System.out.println("===================");

        LocalDate tomorrow = date.plusDays(1); // прибавляет 1 день к текущей дате

        System.out.println(tomorrow);

        System.out.println("plusWeeks: " + date.plusWeeks(4));
        System.out.println("yesterday: " + date.minusDays(1));

        System.out.println("==========================");
        LocalDate date1 = LocalDate.of(2002,2,15);
        LocalDate date2 = LocalDate.of(2002, Month.FEBRUARY, 15);
        System.out.println(date1);
        System.out.println("date2 год: " + date2.getYear() + "; месяц: " + date2.getMonth() + "; число " + date2.getDayOfMonth() + "; день недели: " + date2.getDayOfWeek());
        System.out.println("День года: " + date2.getDayOfYear() + "; номер месяца: " + date2.getMonthValue() + "; эра: " + date2.getEra());
        System.out.println("===========================================");
        String dateString = "2000-10-25";
        LocalDate date3 = LocalDate.parse(dateString);
        System.out.println(date3.getYear() + " : " + date3.getMonth() + " : " + date3.getDayOfMonth());
        System.out.println("=============== Duration ===================\n");

        Instant start = Instant.now();
        int sum = 0;
        for (int i = 0; i < 10000; i++) {
            for (int j = 0; j < i; j++) {
                sum += j;
            }
        }

        Instant end = Instant.now();
        Duration duration = Duration.between(start, end);
        long millis = duration.toMillis();
        long seconds = duration.toSeconds();
        System.out.println(millis + " | " + seconds);
        System.out.println(duration.getNano());

        System.out.println("++++++++++++++++++ Period +++++++++++++++++++++++++\n");
        LocalDate startDate = LocalDate.of(2022,Month.JANUARY, 1);
        LocalDate endDate = LocalDate.of(2023,Month.DECEMBER,31);
        Period period = Period.between(startDate, endDate);
        System.out.println(period);
        System.out.println(period.getYears() + " | " + period.getMonths() + " | " + period.getDays());
        System.out.println(period.toTotalMonths());

        System.out.println("===================== Date Time Formatter =======================\n");

        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM.dd.yyyy hh:mm:ss a");
        String formattedDate = now.format(formatter);
        System.out.println("formattedDate: " + formattedDate);

        String dateForParse = "23-10-26 13:13";
        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("yy-MM-dd HH:mm");
        LocalDateTime parsedDateTime = LocalDateTime.parse(dateForParse, formatter1);
        System.out.println(parsedDateTime.format(formatter1));


        System.out.println("================ Task 1 ====================");

        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("dd-MM-yyyy HH-mm");
        String dateForParse1 = "15-12-2022 20-46";
        String dateForParse2 = "13-01-2023 00-47";
        LocalDateTime dateFromForParse1 = LocalDateTime.parse(dateForParse1, formatter2);
        LocalDateTime dateFromForParse2 = LocalDateTime.parse(dateForParse2, formatter2);

        System.out.println(dateFromForParse1);
        System.out.println(dateFromForParse1.getMonth() + " " + dateFromForParse1.getDayOfMonth() + " " + dateFromForParse1.getHour());
        System.out.println(dateFromForParse2.getDayOfWeek());
        System.out.println(dateFromForParse1.until(dateFromForParse2, ChronoUnit.DAYS));
    }
}
