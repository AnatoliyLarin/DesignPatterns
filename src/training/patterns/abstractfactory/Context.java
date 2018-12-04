package training.patterns.abstractfactory;

import training.patterns.abstractfactory.factories.*;

public class Context {
    public AutoPartsFactory getFactory(String autoBrand){
        if(autoBrand == null){
            return null;
        }
        if(autoBrand.equalsIgnoreCase("BMW")){
            return new BMWAutoPartsFactory();
        } else if (autoBrand.equalsIgnoreCase("Tesla")){
            return new TeslaAutoPartsFactory();
        }
       return null;
    }
}
