package app.core.carPlant;

import app.patterns.listener.CarListener;
import app.patterns.visitor.Visitor;

import java.util.HashSet;
import java.util.Set;

public class TestLine {

    private Set<Visitor> visitors = new HashSet<>();
    private Set<Car> cars = new HashSet<>();
    private Set<CarListener> listeners = new HashSet<>();

    public void addVisitor(Visitor visitor){
        this.visitors.add(visitor);
    }

    public void addListener(CarListener listener){
        this.listeners.add(listener);
    }

    public void addCarUsingListener(Car car){
        this.cars.add(car);
        for(CarListener listener : listeners){
            listener.onRelease(car);
        }
    }

    public void addCarUsingVisitors(Car car){
        this.cars.add(car);
        for(Visitor visitor : visitors){
            visitor.visit(car);
        }
    }

    public void resetTest(){
        visitors.clear();
    }
}