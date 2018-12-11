package training.core.abstractFactory.factories;

import training.core.abstractFactory.interfaces.*;

import java.util.NoSuchElementException;

public class BMWAutoPartsFactory implements AutoPartsFactory {

    Gear createGear(String gearType){
        if(gearType.equalsIgnoreCase("Winter")){
            return new WinterGear();
        } else if(gearType.equalsIgnoreCase("Summer")){
            return new SummerGear();
        }
        throw new NoSuchElementException("The part doesn't exist.");
    }

    Break createBreak(String breakType){
        if(breakType.equalsIgnoreCase("Hard")){
            return new HardBreak();
        } else if(breakType.equalsIgnoreCase("Soft")){
            return new SoftBreak();
        }
        throw new NoSuchElementException("The part doesn't exist.");
    }

    public Wheel createWheel(String wheelType){
        if(wheelType.equalsIgnoreCase("Metal")){
            return new MetalWheel();
        } else if(wheelType.equalsIgnoreCase("Titan")){
            return new TitaniumWheel();
        }
        throw new NoSuchElementException("The part doesn't exist.");
    }
}