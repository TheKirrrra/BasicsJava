package lessons.lesson24_48.cars;

import java.util.Comparator;

public class CarMaxSpeedComparator implements Comparator<Car> {
    @Override
    public int compare(Car car1, Car car2) {
        return car1.getMaxSpeed() - car2.getMaxSpeed();
    }
}
