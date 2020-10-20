package Lab4;

public class Image {
    private String name;


    Image(String name){
        this.name = name;
    }

    public void print(){
        System.out.println("img with name:"+this.name);
    }
}
