package app.patterns.listener;

import app.core.carPlant.Car;
import app.core.carPlant.TestLine;
import app.patterns.abstractFactory.Context;
import app.patterns.visitor.*;

import java.util.ArrayList;

public class TestCarListener {

    public static void main(String[] args){

        // Prepare TestLine and AbstractFactory
        TestLine testLine = new TestLine();
        Context order = new Context();

        // A car's storage
        ArrayList<Car> cars = new ArrayList<>();

        // Initiate listeners
        CarSizeListener carSizeListener = new CarSizeListener();
        CarTestListener carTestListener = new CarTestListener();
        // Add visitors to the listener
        carTestListener.addVisitors(new CarNumberOfSeatsTester());
        carTestListener.addVisitors(new CarColorTester());
        carTestListener.addVisitors(new CarConditioningTester());
        carTestListener.addVisitors(new CarMaxSpeedTester());
        carTestListener.addVisitors(new CarThrowExceptionTester());

        // Add listeners to TestLine
        testLine.addListener(carSizeListener);
        testLine.addListener(carTestListener);

        // Create a few cars for a testing purpose
        Car car1 = new Car.Builder().
                withBreakType(order.getFactory("Tesla").createBreak())
                .withGearType(order.getFactory("Tesla").createGear())
                .withWheelType(order.getFactory("Tesla").createWheel())
                .bodyColor("Green")
                .numberOfSeats(7)
                .withMaxSpeed(175)
                .bodyHeight(175)
                .bodyWidth(350)
                .withMaxSpeed(175)
                .numberOfSeats(7)
                .build();

        Car car2 = new Car.Builder()
                .withBreakType(order.getFactory("Tesla").createBreak())
                .bodyColor("Blue")
                .hasAirCondition(false)
                .withGearType(order.getFactory("Tesla").createGear())
                .withWheelType(order.getFactory("Tesla").createWheel())
                .bodyHeight(185)
                .bodyWidth(350)
                .withMaxSpeed(185)
                .numberOfSeats(11)
                .build();

        Car car3 = new Car.Builder()
                .withBreakType(order.getFactory("Tesla").createBreak())
                .bodyColor("Blue")
                .hasAirCondition(false)
                .withGearType(order.getFactory("Tesla").createGear())
                .withWheelType(order.getFactory("Tesla").createWheel())
                .bodyHeight(185)
                .bodyWidth(350)
                .withMaxSpeed(185)
                .numberOfSeats(3)
                .build();

        // Add a car to a cars' line
        cars.add(car1);
        cars.add(car2);
        cars.add(car3);

        // Perform tests on a TestLine
        for(Car car : cars) {
            System.out.println("\n ========= CAR CHECK =========");
            testLine.addCarUsingListener(car);
        }
    }
}

