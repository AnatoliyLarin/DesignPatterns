package app.patterns.abstractFactory;

import app.patterns.abstractFactory.factories.AutoPartsFactory;
import app.patterns.abstractFactory.factories.*;
import java.util.NoSuchElementException;

public class Context {
    public AutoPartsFactory getFactory(String autoBrand){
        if(autoBrand.equalsIgnoreCase("BMW")){
            return new BMWAutoPartsFactory();
        } else if (autoBrand.equalsIgnoreCase("Tesla")){
            return new TeslaAutoPartsFactory();
        }
        throw new NoSuchElementException("No such factory on the list.");
    }
}
