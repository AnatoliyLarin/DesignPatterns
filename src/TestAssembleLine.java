import app.AssembleLine;

import training.patterns.abstractfactory.Context;
import training.patterns.abstractfactory.factories.AutoPartsFactory;
import training.patterns.abstractfactory.interfaces.*;

public class TestAssembleLine {

    public static void main(String[] args){

        AssembleLine assemble = new AssembleLine();
        Context order =  new Context();

        assemble.assembleBreak(order.getFactory("Tesla").createBreak("Hard"));
        assemble.assembleGear(order.getFactory("BMW").createGear("Winter"));
        assemble.assemleWheel(order.getFactory("Tesla").createWheel("Titan"));
    }
}
