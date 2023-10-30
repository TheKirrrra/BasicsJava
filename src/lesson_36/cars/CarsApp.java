package lesson_36.cars;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.Comparator;

public class CarsApp {
    public static void main(String[] args) {

    Car[] cars = new Car[5];
    cars[0]=new Car("Alfa",2021,120);

    cars[1]=new Car("BMW",2000, 190);

    cars[2]=new Car("Citroen",2018, 170);

    cars[3]=new Car("Dodge",2023,205);

    cars[4]=new Car("Ferrari",2021,300);
        System.out.println(Arrays.toString(cars));

        int[] ints = new int[] {9,5,1,2,4,3,0};
        System.out.println(Arrays.toString(ints));
        Arrays.sort(ints);
        System.out.println(Arrays.toString(ints));

        Arrays.sort(cars);
        System.out.println(Arrays.toString(cars));

        CarYearComparator carYearComparator = new CarYearComparator();
        CarMaxSpeedComparator carMaxSpeedComparator = new CarMaxSpeedComparator();

        Arrays.sort(cars, carYearComparator);
        System.out.println(Arrays.toString(cars));

        Arrays.sort(cars, carMaxSpeedComparator);
        System.out.println(Arrays.toString(cars));

        Arrays.sort(cars, new Comparator<Car>() {
            @Override
            public int compare(Car car1, Car car2) {
                return car1.getModel().compareTo(car2.getModel());
            }
        });
        System.out.println(Arrays.toString(cars));

        Arrays.sort(cars, (car1, car2) -> car1.getYear() - car2.getYear()); // Метод compare, очень сокращенный.

        System.out.println(Arrays.toString(cars));

        Arrays.sort(cars, (car1, car2) -> {
            int yearCompare = Integer.compare(car1.getYear(), car2.getYear());
            if (yearCompare == 0) {
                return car1.getModel().compareTo(car2.getModel());
            } else {
                return yearCompare;
            }
        });

        System.out.println(Arrays.toString(cars));

        Arrays.sort(cars, (car1, car2) -> car2.getMaxSpeed() - car1.getMaxSpeed());

        Comparator<Car> speedYearComparator = Comparator
                .comparing(Car::getMaxSpeed)
                .reversed().thenComparing(Car::getYear);

        Arrays.sort(cars, speedYearComparator);
        System.out.println(Arrays.toString(cars));

        Comparator<Car> yearSpeedComparator = Comparator
                .comparing(Car::getYear)
                .thenComparing(Car::getMaxSpeed).reversed();

        Arrays.sort(cars, yearSpeedComparator);
        System.out.println(Arrays.toString(cars));
    }
}
