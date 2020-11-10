package models;

import services.Visitor;

public interface Element {

    public void print();

    void accept(Visitor visitor);
}
