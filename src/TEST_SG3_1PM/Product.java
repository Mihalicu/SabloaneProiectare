package TEST_SG3_1PM;

public class Product implements Element{
    private String name;
    int pret;
    public Product(String name,int pret) {
        this.name = name;
        this.pret = pret;
    }
    public void print()
    {
        System.out.println("Product with name: " + this.name+" has the price: "+this.pret);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPret() {
        return pret;
    }

    public void setPret(int pret) {
        this.pret = pret;
    }
}
