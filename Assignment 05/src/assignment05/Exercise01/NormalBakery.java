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

    /**
     * Normal Bakery as class, extends the Bakery-Decorator with functionalities and own characteristics and can be reused by subclasses
     * @param initname Name of Bakery, has to be unique: String
     * @param initstreetname Name of Street for address: String
     * @param initnumber House-number for address: integer
     * @param initpostalcode Postal Code for Address: String
     * @param initcity city where bakery is located: String
     */

    public NormalBakery(String initname, String initstreetname, int initnumber, String initpostalcode, String initcity) {
        this.name =  initname;
        this.streetname=initstreetname;
        this.number = initnumber;
        this.postalcode = initpostalcode;
        this.city = initcity;

    }

    /**
     *
     * @return Name of Bakery (unique): String
     */

    public String getName(){
            return name;
        }

    /**
     * prints Name of Bakery
     */
    public void printName(){
        System.out.print(name);
    }

    /**
     * 
     * @return name of city: String
     */
    public String getCity(){
        return city;
    }

    /**
     * This method allows the bakery to calculate the price of a sandwich. Currently no item/class sandwich returned.
     * @param ham amount of ham >=0: int
     * @param tomatoes amount of tomatoes >=0: int
     * @param cheese amount of cheese >=0: int
     * @param tuna amount of tuna >=0: int
     * @return price of sandwich with all components: double
     */
    public double sellSandwich(int ham, int tomatoes, int cheese, int tuna){
    if (ham<0 || tomatoes<0 || cheese<0 || tuna<0){
        System.out.println("invalid input, toppings have to be positive");
        return -1;
    }
    double price = 0;
    price = price + ham*2+ tomatoes*1.5 + cheese*1 + tuna*3;
    return price;
    }

    /**
     * This method allows the bakery to calculate the price of a cake. Currently no item/class cake returned.
     * @param strawberries amount of strawberries >=0: int
     * @param cream amount of cream >=0: int
     * @param chocolate amount of chocolate >=0: int
     * @return price of cake with all components: double
     */
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
