package models;

import services.Visitor;

public class ImageProxy implements Element{

    private String name;
    Image realSubject=null;

    public ImageProxy(String name){
        this.name=name;
    }

    public void print() {
        if(realSubject==null){
            realSubject= new Image(this.name);
        }
        realSubject.print();
    }

    @Override
    public void accept(Visitor visitor) {

    }
}
