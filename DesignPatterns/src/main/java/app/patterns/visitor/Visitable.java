package app.patterns.visitor;

public interface Visitable {

    void accept(Visitor visitor);
}
