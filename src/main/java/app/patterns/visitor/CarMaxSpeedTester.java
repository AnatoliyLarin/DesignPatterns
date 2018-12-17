package app.patterns.visitor;

import app.core.carPlant.Car;

public class CarMaxSpeedTester implements Visitor {

    @Override
    public void visit(Car carForTest) {
        if(carForTest.getMaxSpeed() > 180)
            System.out.println("Car type check - visitor: <<Looks like it's a sport car.>>");
        else
            System.out.println("Car type check - visitor: <<Looks like it's a regular car>>.");
    }
}