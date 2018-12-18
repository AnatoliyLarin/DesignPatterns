package app.core.carPlant;

import app.patterns.visitor.Visitor;

import java.util.HashSet;
import java.util.Set;

public class TestLine {

    private Set<Visitor> visitors = new HashSet<>();
    private Set<Car> cars = new HashSet<>();

    public void addVisitor(Visitor visitor){
        this.visitors.add(visitor);
    }

    public void addCar(Car car){
        this.cars.add(car);
        for(Visitor visitor : visitors){
            visitor.visit(car);
        }
    }

    public void resetTest(){
        visitors.clear();
    }
}