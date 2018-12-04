package training.patterns.abstractfactory.factory;

import training.patterns.abstractfactory.interfaces.*;

public class TeslaAutoPartsFactory implements AutoPartsFactory {

    @Override
    public Gear createGear(String gearType) {
        if(gearType == null){
            return null;
        }
        return null;
    }

    @Override
    public Break createBreak(String breakType) {
        if(breakType == null){
            return null;
        }
        return null;
    }

    @Override
    public Wheel createWheel(String wheelType) {
        if(wheelType == null){
            return null;
        }
        return null;
    }
}
