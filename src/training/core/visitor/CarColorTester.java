package training.core.visitor;

import app.Car;

public class CarColorTester implements Visitor{

    @Override
    public void visit(Car carForTest) {
        if(carForTest.getColor().equalsIgnoreCase("Green"))
            System.out.println("The car is green.");
        else
            System.out.println("The car has a color different to green.");
    }
}