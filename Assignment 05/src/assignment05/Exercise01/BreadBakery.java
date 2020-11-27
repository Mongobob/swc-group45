package assignment05.Exercise01;

public class BreadBakery extends NormalBakery{
    /**
     * This class represents a bread-bakery only able to sell Bread and Sandwiches.
     * Initializes NormalBakery to reuse its code and functionalities
     * @param initname Name of Bakery, has to be unique: String
     * @param initstreetname Name of Street for address: String
     * @param initnumber House-number for address: integer
     * @param initpostalcode Postal Code for Address: String
     * @param initcity city where bakery is located: String
     */
    /*
Bakeries: There are three different types of bakeries:
1. Normal bakeries , which sell both bread and sweets
2. Bakeries specialized in bread , which sell only bread
3. Bakeries specialized in sweets , which sell only sweets
Furthermore, each bakery has a unique name (e.g., "Bakery Crunchy Bread"),
an address (including the street name and number, postal code, and city).
Each bakery has a method "printName" to print the name of the bakery.
*/
    /*
    private String name;
    private String streetname;
    private int number;
    private String postalcode;
    private String city;
    */

    BreadBakery(String initname, String initstreetname, int initnumber, String initpostalcode, String initcity) {
        super(initname, initstreetname,initnumber,initpostalcode,initcity);

    }

    /**
     *Prints name of the bakery (actually of the instanciated superclass)
     */
    public void printName(){
         super.printName();
    }

    /**
     *
     * @return Super Name of Bakery (unique): String
     */
    public String getName(){
        return super.getName();
    }

    /**
     *
     * @return Super Name of city: String
     */
    public String getCity(){
        return super.getCity();
    }

    /**
     * This method allows the bakery to calculate the price of a sandwich. Currently no item/class sandwich returned.
     * @param ham amount of ham >=0: int
     * @param tomatoes amount of tomatoes >=0: int
     * @param cheese amount of cheese >=0: int
     * @param tuna amount of tuna >=0: int
     * @return Determined price of Sandwich by super-class: double
     */
    public double sellSandwich(int ham, int tomatoes, int cheese, int tuna){
        return super.sellSandwich(ham,tomatoes,cheese,tuna);
    }

}
