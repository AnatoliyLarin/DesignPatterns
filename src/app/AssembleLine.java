package app;

import training.core.abstractFactory.interfaces.*;

public class AssembleLine{

    public Gear assembleGear(Gear gear){
        return gear;
    }

    public Break assembleBreak(Break breakdown){
        return breakdown;
    }

    public Wheel assemleWheel(Wheel wheel){
        return wheel;
    }
}
