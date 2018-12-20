package app.patterns.visitor;

import app.core.carPlant.Car;
import app.core.carPlant.TestLine;
import app.patterns.abstractFactory.Context;

import java.util.ArrayList;

public class TestVisitor {

    public static void main(String[] args) {

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

        Car car3 = new Car.Builder()
                .withBreakType(factory.getFactory("Tesla").createBreak())
                .bodyColor("Blue")
                .hasAirCondition(false)
                .withGearType(factory.getFactory("Tesla").createGear())
                .withWheelType(factory.getFactory("Tesla").createWheel())
                .bodyHeight(185)
                .bodyWidth(350)
                .withMaxSpeed(185)
                .numberOfSeats(3)
                .build();

        cars.add(car1);
        cars.add(car2);
        cars.add(car3);

        // TestLine - test code
        TestLine checkTestLine = new TestLine();

        checkTestLine.addVisitor(new CarColorTester());
        checkTestLine.addVisitor(new CarMaxSpeedTester());
        checkTestLine.addVisitor(new CarNumberOfSeatsTester());
        checkTestLine.addVisitor(new CarConditioningTester());
        checkTestLine.addVisitor(new CarThrowExceptionTester());

        System.out.println("\n Test TestLine implementation with Visitors...\n");

        for (Car car : cars) {
            System.out.println("------------- check started ------------------------");
            checkTestLine.addCarUsingVisitors(car);
            System.out.println("------------- check finished ------------------------\n");
        }

        // Clear visitors
        checkTestLine.resetTest();

        // Make sure visitors are removed
        System.out.println("\nVisitors are removed...\n");
       // System.out.println("------------- check started ------------------------");

        for (Car car : cars) {
            System.out.println("------------- check started ------------------------");
            checkTestLine.addCarUsingVisitors(car);
            System.out.println("------------- check finished ------------------------\n");
        }
    }
}