package training.patterns.abstractfactory.factory;

import training.patterns.abstractfactory.interfaces.*;

public interface AutoPartsFactory {

    public Gear createGear(String gearType);

    public Break createBreak(String breakType);

    public Wheel createWheel(String wheelType);
}
