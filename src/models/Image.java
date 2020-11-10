package models;

import services.ImageLoaderFactory;
import services.Visitor;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class Image implements Element {

    private String imageName;

    public Image(String name) {
        this.imageName = name;
        try {
            TimeUnit.SECONDS.sleep(2);
            ImageLoaderFactory.create(name);

        } catch (InterruptedException | IOException e) {
            e.printStackTrace();
        }
    }

    public void print() {
        System.out.println("models.Image with name: " + this.imageName);
    }

    @Override
    public void accept(Visitor visitor) {

    }
}
