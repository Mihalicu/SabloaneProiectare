package models;

public class Author {

    private String name;

    Author(String name){
        this.name=name;
    }

    public void print(){
        System.out.println("models.Author: "+this.name);
    }

}
