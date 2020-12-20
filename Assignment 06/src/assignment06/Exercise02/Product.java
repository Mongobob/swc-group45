package assignment06.Exercise02;

public abstract class Product {
    protected String name;
    protected double price;
    protected double size;
    protected String colour;
    protected Customer seller;

    public String getName(){
        return name;
    }
    public double getSize(){
        return size;
     }
    public double getPrice(){
        return price;
    }
    public String getColour(){
        return colour;
    }
    public Customer getSeller(){return seller;}

}
