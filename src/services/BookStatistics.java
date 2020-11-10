package services;

import models.*;

public class BookStatistics implements Visitor{
    private int imagesCounter = 0;
    private int tablesCounter = 0;
    private int paragraphCounter = 0;
    private int sectionCounter = 0;


    public void visit(Image image){imagesCounter++;}
    public void visit(ImageProxy imageProxy){paragraphCounter++;}

    @Override
    public void visit(Paragraph paragraph) {

    }

    public void visit(Table table){tablesCounter++;}

    public void visit(Section section){sectionCounter++;}

    public void printStatistics(){
        System.out.println("Book Statistics: ");
        System.out.println("Number of images: "+imagesCounter);
        System.out.println("Number of tables: "+tablesCounter);
        System.out.println("Number of paragraph: "+paragraphCounter);
        System.out.println("Number of section: "+sectionCounter);
    }

}
