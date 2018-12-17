package app.patterns.visitor;

import app.core.carPlant.Car;

public class CarConditioningTester implements Visitor {

    @Override
    public void visit(Car carForTest) {
        if(!carForTest.isHasAirCondition()){
            System.out.println("Attention! The conditioner is missed. Please, fix the issue.");
        }
        else{
            System.out.println("Conditioning test has been passed.");
        }
    }
}
