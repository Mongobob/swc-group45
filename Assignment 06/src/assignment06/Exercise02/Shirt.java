package assignment06.Exercise02;

public class Shirt extends Clothes{
    public String name;
    public double price;
    public double size;
    public String colour;

    public Shirt(String initname, double initprice, double initsize, String initcoulour){
        this.name=initname;
        this.price=initprice;
        this.size=initsize;
        this.colour=initcoulour;
    }
    public String getName(){
        return this.name;
    }
    public double getPrice(){
        return this.price;
    }
    public double getSize(){
        return this.size;
    }
    public String getColour(){
        return this.colour;
    }

}
