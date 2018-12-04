package training.patterns.abstractfactory.factory;

import training.patterns.abstractfactory.interfaces.*;

public class TeslaAutoPartsFactory implements AutoPartsFactory {

    @Override
    public Gear createGear() {
        return null;
    }

    @Override
    public Break createBreak() {
        return null;
    }

    @Override
    public Wheel createWheel() {
        return null;
    }
}
