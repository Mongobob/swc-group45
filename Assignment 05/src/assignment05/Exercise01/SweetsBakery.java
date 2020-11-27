package assignment05.Exercise01;

public class SweetsBakery extends NormalBakery {
    /*
Bakeries: There are three different types of bakeries:
1. Normal bakeries , which sell both bread and sweets
2. Bakeries specialized in bread , which sell only bread
3. Bakeries specialized in sweets , which sell only sweets
Furthermore, each bakery has a unique name (e.g., "Bakery Crunchy Bread"),
an address (including the street name and number, postal code, and city).
Each bakery has a method "printName" to print the name of the bakery.
*/

    /**
     * Class Sweetsbakery that reuses Normalbakery and only sells Sweets (Cakes)
     * @param initname Name of Bakery, has to be unique: String
     * @param initstreetname Name of Street for address: String
     * @param initnumber House-number for address: integer
     * @param initpostalcode Postal Code for Address: String
     * @param initcity city where bakery is located: String
     */

    public SweetsBakery(String initname, String initstreetname, int initnumber, String initpostalcode, String initcity) {
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
     * Super: This method allows the bakery to calculate the price of a cake. Currently no item/class cake returned.
     * @param strawberries amount of strawberries >=0: int
     * @param cream amount of cream >=0: int
     * @param chocolate amount of chocolate >=0: int
     * @return Determined price of cake by super-class: double
     */
    public double sellCake(int strawberries, int cream, int chocolate){
        return super.sellCake(strawberries,cream,chocolate);
    }

}
