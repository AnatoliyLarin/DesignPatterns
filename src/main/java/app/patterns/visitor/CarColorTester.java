package app.patterns.visitor;

import app.core.carPlant.Car;

public class CarColorTester implements Visitor {

    @Override
    public void visit(Car carForTest) {
        if (carForTest.getColor().equalsIgnoreCase("Green"))
            System.out.println("Color check - visitor: <<The car is green.>>");
        else
            System.out.println("Color check - visitor: <<The car has a color different to green.>>");
    }
}