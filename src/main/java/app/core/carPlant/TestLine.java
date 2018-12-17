package app.core.carPlant;

import app.patterns.listener.CarListener;

import java.util.HashSet;
import java.util.Set;

public class TestLine {

    private Set<Car> cars = new HashSet<>();
    private Set<CarListener> listeners = new HashSet<>();

    public void addCar(Car queuedCar) {
        this.cars.add(queuedCar);
        for(CarListener listener : listeners) {
            listener.onRelease(queuedCar);
        }

    }
//
//    public void addListener(CarListener listener) {
//        this.visitors.add(listener);
//    }

}