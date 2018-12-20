package app.patterns.listener;

import app.core.carPlant.Car;
import app.patterns.visitor.Visitor;
import java.util.ArrayList;
import java.util.List;

public class CarTestListener implements CarListener{

    private List<Visitor> visitors = new ArrayList<>();

    @Override
    public void onRelease(Car car){
        System.out.println("----------------------------------");
        System.out.println("Listener - CarTestListener");
        System.out.println("----------------------------------");
        for(Visitor visitor : visitors){
            visitor.visit(car);
        }
    }

    public void addVisitors(Visitor visitor){
        this.visitors.add(visitor);
    }
}