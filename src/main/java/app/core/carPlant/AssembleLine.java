package app.core.carPlant;

import app.core.carPlant.interfaces.*;

public class AssembleLine{

    public Gear assembleGear(Gear gear){
        return gear;
    }

    public Break assembleBreak(Break breakdown){
        return breakdown;
    }

    public Wheel assembleWheel(Wheel wheel){
        return wheel;
    }
}