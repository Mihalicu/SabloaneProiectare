public class ImageProxy implements Element{

    private String name;
    Image realSubject=null;

    ImageProxy(String name){
        this.name=name;
    }

    public void print() {
        if(realSubject==null){
            realSubject= new Image(this.name);
        }
        realSubject.print();
    }
}
