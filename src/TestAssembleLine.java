import app.AssembleLine;
import training.patterns.abstractfactory.interfaces.*;

import training.patterns.abstractfactory.Context;

public class TestAssembleLine {

    public static void main(String[] args){

        AssembleLine assemble = new AssembleLine();
        Context order =  new Context();

        Break breakType = assemble.assembleBreak(order.getFactory("Tesla").createBreak("Hard"));
        Gear gearType = assemble.assembleGear(order.getFactory("BMW").createGear("Winter"));
        Wheel wheelType = assemble.assemleWheel(order.getFactory("Tesla").createWheel("Titan"));

        System.out.println("\n");

        System.out.println("Break type: " + breakType.stop());
        System.out.println("Gear type: " + gearType.run());
        System.out.println("Wheel type: " + wheelType.run());
    }
}
