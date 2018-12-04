package training.patterns.abstractfactory.factory;

import training.patterns.abstractfactory.interfaces.*;

public class BMWAutoPartsFactory implements AutoPartsFactory {

    public Gear createGear(){
        return null;
    }

    public Break createBreak(){
        return null;
    }

    public Wheel createWheel(){
        return null;
    }
}