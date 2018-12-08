package training.core.abstractFactory.factories;

import training.core.abstractFactory.interfaces.*;

public class TeslaAutoPartsFactory implements AutoPartsFactory {

    @Override
    public Gear createGear(String gearType) {
        if(gearType.equalsIgnoreCase("Winter")){
            return new WinterGear();
        } else if(gearType.equalsIgnoreCase("Summer")){
            return new SummerGear();
        }
        return null;
    }

    @Override
    public Break createBreak(String breakType) {
        if(breakType.equalsIgnoreCase("Hard")){
            return new HardBreak();
        } else if(breakType.equalsIgnoreCase("Soft")){
            return new SoftBreak();
        }
        return null;
    }

    @Override
    public Wheel createWheel(String wheelType) {
        if(wheelType.equalsIgnoreCase("Metal")){
            return new MetalWheel();
        } else if(wheelType.equalsIgnoreCase("Titan")){
            return new TitaniumWheel();
        }
        return null;
    }
}