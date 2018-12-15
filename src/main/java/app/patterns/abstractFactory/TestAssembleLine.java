package app.patterns.abstractFactory;

import app.core.carPlant.AssembleLine;
import app.core.carPlant.interfaces.*;

public class TestAssembleLine {

    public static void main(String[] args){

        AssembleLine assemble = new AssembleLine();
        Context order =  new Context();

        Break breakType = assemble.assembleBreak(order.getFactory("Tesla").createBreak());
        Gear gearType = assemble.assembleGear(order.getFactory("BMW").createGear());
        Wheel wheelType = assemble.assembleWheel(order.getFactory("Tesla").createWheel());

        System.out.println("\n");

        System.out.println("Break type: " + breakType.stop());
        System.out.println("Gear type: " + gearType.run());
        System.out.println("Wheel type: " + wheelType.run());
    }
}