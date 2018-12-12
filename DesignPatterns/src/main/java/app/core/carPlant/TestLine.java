package app.core.carPlant;

import training.core.visitor.Visitor;

import java.util.HashSet;
import java.util.Set;

public class TestLine {

    private Set<Car> cars = new HashSet<>();

    public void addCar(Car queuedCar) {
        this.cars.add(queuedCar);
    }

    public void test(Visitor visit){
        for(Car car:cars){
            car.accept(visit);
        }
    }
}