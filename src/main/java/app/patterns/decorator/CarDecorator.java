package app.patterns.decorator;

import app.core.carPlant.interfaces.BaseCar;

class CarDecorator implements BaseCar {
    protected BaseCar car;

    public CarDecorator(BaseCar car){
        this.car = car;
    }

    @Override
    public String getCarType(){
        System.out.println("Base decorator");
        return this.car.getCarType();
    }
}