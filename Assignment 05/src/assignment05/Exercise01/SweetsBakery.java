package src.assignment05.Exercise01;

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

    public SweetsBakery(String initname, String initstreetname, int initnumber, String initpostalcode, String initcity) {
        super(initname, initstreetname,initnumber,initpostalcode,initcity);

    }

    public void printName(){
        super.printName();
    }

    public String getName(){
        return super.getName();
    }

    public String getCity(){
        return super.getCity();
    }

    public double sellCake(int strawberries, int cream, int chocolate){
        return super.sellCake(strawberries,cream,chocolate);
    }

}
