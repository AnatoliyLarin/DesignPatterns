package training.patterns.abstractfactory;

import training.patterns.abstractfactory.factory.AutoPartsFactory;
import training.patterns.abstractfactory.factory.BMWAutoPartsFactory;
import training.patterns.abstractfactory.factory.TeslaAutoPartsFactory;

public class Context {
    public AutoPartsFactory getFactory(String autoBrand){
        if(autoBrand == "BMW"){
            return new BMWAutoPartsFactory();
        } else if (autoBrand == "Tesla"){
            return new TeslaAutoPartsFactory();
        }
       return null;
    }
}
