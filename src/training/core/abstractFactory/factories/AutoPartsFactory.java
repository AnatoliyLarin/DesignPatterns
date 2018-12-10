package training.core.abstractFactory.factories;

import training.core.abstractFactory.interfaces.*;

public interface AutoPartsFactory<T, M, N> {

//    Gear createGear(String gearType);
    T createGear(String gearType);

//    Break createBreak(String breakType);
    M createBreak(String breakType);

//    Wheel createWheel(String wheelType);
    N createWheel(String wheelType);
}
