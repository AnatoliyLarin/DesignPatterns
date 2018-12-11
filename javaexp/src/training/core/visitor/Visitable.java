package training.core.visitor;

import app.Car;

public interface Visitable {

    void accept(Visitor visitor);
}
