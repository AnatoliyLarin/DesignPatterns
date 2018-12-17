package app.patterns.visitor;

import app.core.carPlant.Car;
import app.patterns.abstractFactory.Context;

import java.util.ArrayList;

public class TestVisitor {

    public static void main(String[] args){

        Context factory = new Context();
        ArrayList<Car> cars = new ArrayList<>();

        Car car1 = new Car.Builder()
                .withBreakType(factory.getFactory("Tesla").createBreak())
                .bodyColor("Green")
                .hasAirCondition(true)
                .withGearType(factory.getFactory("Tesla").createGear())
                .withWheelType(factory.getFactory("Tesla").createWheel())
                .bodyHeight(175)
                .bodyWidth(350)
                .withMaxSpeed(175)
                .numberOfSeats(7)
                .build();

        Car car2 = new Car.Builder()
                .withBreakType(factory.getFactory("Tesla").createBreak())
                .bodyColor("Blue")
                .hasAirCondition(false)
                .withGearType(factory.getFactory("Tesla").createGear())
                .withWheelType(factory.getFactory("Tesla").createWheel())
                .bodyHeight(185)
                .bodyWidth(350)
                .withMaxSpeed(185)
                .numberOfSeats(11)
                .build();

        cars.add(car1);
        cars.add(car2);

        // Perform some kind of tests for a car before deliver to a customer
        for(Car car: cars){
            car.accept(new CarColorTester());
            car.accept(new CarMaxSpeedTester());
            car.accept(new CarNumberOfSeatsTester());
            car.accept(new CarConditioningTester());
            System.out.println("-------------------------------------");
        }
    }
}