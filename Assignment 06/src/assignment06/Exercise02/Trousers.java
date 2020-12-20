package assignment06.Exercise02;

public class Trousers extends Clothes {
    public String name;
    public double price;
    public double size;
    public String colour;

    public Trousers(String initname, double initprice, double initsize, String initcoulour,Customer initseller){
        name=initname;
        price=initprice;
        size=initsize;
        colour=initcoulour;
        seller=initseller;
    }



}