package assignment05.Exercise01;

public class NormalBakery extends Bakery{
    /*
Bakeries: There are three different types of bakeries:
1. Normal bakeries , which sell both bread and sweets
2. Bakeries specialized in bread , which sell only bread
3. Bakeries specialized in sweets , which sell only sweets
Furthermore, each bakery has a unique name (e.g., "Bakery Crunchy Bread"),
an address (including the street name and number, postal code, and city).
Each bakery has a method "printName" to print the name of the bakery.
*/
    private String name;
    private String streetname;
    private int number;
    private String postalcode;
    private String city;

    public NormalBakery(String initname, String initstreetname, int initnumber, String initpostalcode, String initcity) {
        this.name =  initname;
        this.streetname=initstreetname;
        this.number = initnumber;
        this.postalcode = initpostalcode;
        this.city = initcity;

    }

    public String getName(){
            return name;
        }

    public void printName(){
        System.out.print(name);
    }

    public String getCity(){
        return city;
    }

    public double sellSandwich(int ham, int tomatoes, int cheese, int tuna){
    if (ham<0 || tomatoes<0 || cheese<0 || tuna<0){
        System.out.println("invalid input, toppings have to be positive");
        return -1;
    }
    double price = 0;
    price = price + ham*2+ tomatoes*1.5 + cheese*1 + tuna*3;
    return price;
    }

    public double sellCake(int strawberries, int cream, int chocolate){
        if (strawberries<0 || cream<0 || chocolate<0){
            System.out.println("invalid input, toppings have to be positive");
            return -1;
        }
        double price = 3;
        price = price + strawberries*1+ cream*1.5 + chocolate*2;
        return price;
    }


}
