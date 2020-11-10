package models;

import services.AlignStrategy;
import services.Visitor;

public class Paragraph implements Element{

    String name;
    AlignStrategy alignStrategy;

    public Paragraph(String name){
        this.name=name;
    }

    public void print(){

        if(alignStrategy==null) {
            System.out.println(this.name);
        }else{
            alignStrategy.render(this.name);
        }
    }

    @Override
    public void accept(Visitor visitor) {

    }

    public void setAlignStrategy(AlignStrategy alignStrategy){
        this.alignStrategy=alignStrategy;
    }

}