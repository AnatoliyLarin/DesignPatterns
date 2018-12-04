package app;

import training.patterns.abstractfactory.interfaces.*;
public class AssembleLine {

    public Gear assembleGear(Gear gear){
        return new Gear;
    };

    public Break assembleBreak(Break breakdown){
        return new Break();
    };

    public Wheel assemleWheel(Wheel wheel){
        return new Wheel;
    };
}
