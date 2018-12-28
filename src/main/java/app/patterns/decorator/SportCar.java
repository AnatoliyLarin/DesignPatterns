package app.patterns.decorator;

import app.core.carPlant.interfaces.BaseCar;

public class SportCar extends CarDecorator {

        SportCar(BaseCar car) {
            super(car);
        }

        public String getCarType(){
            String carType = "Sport car";
            System.out.println("\nConcrete decorator: Sport car");
            return super.getCarType();
    }
}
