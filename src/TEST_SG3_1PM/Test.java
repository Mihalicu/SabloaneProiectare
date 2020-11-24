package TEST_SG3_1PM;

public class Test {
    public static void main(String[] args) {
        Box cap1 = new Box("Box1");
        Box cap2 = new Box("Box2");
        Box cap3 = new Box("Box3");
        Phone p1 = new Phone("Phone 1",500);
        Phone p2 = new Phone("Phone 2",350);
        Phone p3 = new Phone("Phone 3",450);
        Phone p4 = new Phone("Phone 4",40);
        Headphones h1 = new Headphones("Headphone 1",100);
        Charger c1 = new Charger("charger1",50);
        cap1.add(p1);
        cap1.add(p2);
        cap1.add(p3);
        cap2.add(cap1);
        cap2.add(cap3);
        cap3.add(h1);
        cap2.add(c1);
        cap2.add(p4);

        p3.setSistem("iOS");
        p1.setSistem("Windows Phone");
        p2.setSistem("Android");
        p4.setSistem("iOS");


        cap2.print();
    int nr =0;
        for(Element e :cap1.content)
        {
            nr++;
        }

    int s=0;
        for(int i =0;i<nr;i++)
        {

            s=s+((Product)cap1.getElement(i)).getPret();
        }
    System.out.println("The prices of phones from <Box1> is: "+s);

    }





    /*
Box: Box2
Box: Box1
@Windows Phone: Product with name: Phone 1 has the price: 500
@Android: Product with name: Phone 2 has the price: 350
@iOS: Product with name: Phone 3 has the price: 450
---------------End of Box1
Box: Box3
Product with name: Headphone 1 has the price: 100
---------------End of Box3
Product with name: charger1 has the price: 50
@iOS: Product with name: Phone 4 has the price: 40
---------------End of Box2
The prices of phones from <Box1> is: 1300

Process finished with exit code 0

     */
}
