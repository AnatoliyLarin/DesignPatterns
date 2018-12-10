package app;

import app.Car;
import training.core.visitor.Visitor;

import java.util.HashSet;
import java.util.Set;

public class TestLine {

    private Set<Car> cars = new HashSet<>();

    public Set<Car> addCar(Car queuedCar) {
        this.cars.add(queuedCar);
        return this.cars;
    }

    public void test(Visitor visit){
        for(Car car:cars){
            car.accept(visit);
        }
    }
}