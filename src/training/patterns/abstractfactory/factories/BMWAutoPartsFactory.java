package training.patterns.abstractfactory.factories;

import training.patterns.abstractfactory.interfaces.*;

public class BMWAutoPartsFactory implements AutoPartsFactory {

    @Override
    public Gear createGear(String gearType){
        if(gearType == null) {
            return null;
        }
        if(gearType.equalsIgnoreCase("Winter")){
            return new WinterGear();
        } else if(gearType.equalsIgnoreCase("Summer")){
            return new SummerGear();
        }
        return null;
    }

    @Override
    public Break createBreak(String breakType){
        if(breakType == null){
            return null;
        }
        if(breakType.equalsIgnoreCase("Hard")){
            return new HardBreak();
        } else if(breakType.equalsIgnoreCase("Soft")){
            return new SoftBreak();
        }
        return null;
    }

    @Override
    public Wheel createWheel(String wheelType){
        if(wheelType == null){
            return null;
        }
        if(wheelType.equalsIgnoreCase("Metal")){
            return new MetalWheel();
        } else if(wheelType.equalsIgnoreCase("Titan")){
            return new TitaniumWheel();
        }
        return null;
    }
}