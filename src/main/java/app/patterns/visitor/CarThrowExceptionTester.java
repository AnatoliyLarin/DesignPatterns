package app.patterns.visitor;

import app.core.carPlant.Car;

import java.util.NoSuchElementException;

public class CarThrowExceptionTester implements Visitor {

    @Override
    public void visit(Car carForTest) {
        if( carForTest.getNumberOfSeats() <=3){
            try {
                throw new NoSuchElementException("A few seats are missed... issue need to be fixed...");
            } catch(Exception e){
                System.out.println("Attention - exception on the line!!! " + e.getMessage());
                e.printStackTrace();
            }
        }
    }
}
