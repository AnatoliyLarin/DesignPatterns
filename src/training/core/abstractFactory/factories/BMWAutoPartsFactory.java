package training.core.abstractFactory.factories;

import training.core.abstractFactory.interfaces.*;

import java.util.NoSuchElementException;
import java.util.concurrent.ExecutionException;

public class BMWAutoPartsFactory implements AutoPartsFactory {

    @Override
    public Gear createGear(String gearType){
        if(gearType.equalsIgnoreCase("Winter")){
            return new WinterGear();
        } else if(gearType.equalsIgnoreCase("Summer")){
            return new SummerGear();
        }
//        return null;
        throw new NoSuchElementException("The part doesn't exist.");
    }

    @Override
    public Break createBreak(String breakType){
        if(breakType.equalsIgnoreCase("Hard")){
            return new HardBreak();
        } else if(breakType.equalsIgnoreCase("Soft")){
            return new SoftBreak();
        }
//        return null;
        throw new NoSuchElementException("The part doesn't exist.");
    }

    @Override
    public Wheel createWheel(String wheelType){
        if(wheelType.equalsIgnoreCase("Metal")){
            return new MetalWheel();
        } else if(wheelType.equalsIgnoreCase("Titan")){
            return new TitaniumWheel();
        }
//        return null;
        throw new NoSuchElementException("The part doesn't exist.");
    }
}