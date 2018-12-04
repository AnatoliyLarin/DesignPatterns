package training.patterns.abstractfactory.factory;

import training.patterns.abstractfactory.interfaces.*;

public interface AutoPartsFactory {

    public Gear createGear();

    public Break createBreak();

    public Wheel createWheel();
}
