package app.patterns.visitor;

import app.core.carPlant.Car;

public class CarNumberOfSeatsTester implements Visitor{

    @Override
    public void visit(Car carForTest) {

        if(carForTest.getNumberOfSeats() > 10){
            System.out.println("There is more than <11> seats... please move the car to technicals");
        }
        else
            System.out.println("Car seats - visitor: <<Number of seats: " + carForTest.getNumberOfSeats() + " >>");
    }
}
