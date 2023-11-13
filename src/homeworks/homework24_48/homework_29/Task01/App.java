package homeworks.homework24_48.homework_29.Task01;
/*
Создайте интерфейсы Swimmer и Runner с методами swim и run соответственно.
Реализуйте класс Triathlete, который будет реализовывать оба интерфейса.
Убедитесь, что класс Triathlete корректно выполняет действия, связанные с бегом и плаванием.
 */
public class App {
    public static void main(String[] args) {
        Triathlete triathlete = new Triathlete("J. Smith", 37);

        triathlete.run();
        triathlete.swim();
    }
}
