import app.Car;

import java.util.HashSet;
import java.util.Set;

public class TestLine {

    private Set<Car> cars = new HashSet<>();

    public Set<Car> addCar(Car queuedCar) {
        this.cars.add(queuedCar);
        return this.cars;
    }
}