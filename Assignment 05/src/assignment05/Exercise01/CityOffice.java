package assignment05.Exercise01;
import java.util.ArrayList;

public class CityOffice {
    /**
     * This class with unique city saves and handles all bakeries of said city. Can print their names in certain format.
     */
    private ArrayList<Bakery> localBakeries = new ArrayList();
    private String city;

    public CityOffice(String city) {
        this.city = city;
    }

    /**
     *
     * @return Name of city that CityOffice is located in (unique): String
     */
    public String getCity() {
        return city;
    }

    /**
     * Adds bakery to listed bakeries in cityoffice
     * @param bakery Decorator-Class bakery or subclasses to be added
     * @throws exceptions if bakery doesn't have a unique name or is located in another city
     */
    public void addBakery(Bakery bakery) {
        for (int i = 0; i < localBakeries.size(); i++) {
            if (bakery.getName().equals(localBakeries.get(i).getName())) {
                System.out.print("Bakery-Names have to be unique");
                throw new UnsupportedOperationException();
            } else if(! bakery.getCity().equals(city)) {
                System.out.print("Bakeries have to be in the same city as the city-offices");
                throw new UnsupportedOperationException();
            }
        }
        localBakeries.add(bakery);
    }

    /**
     * Removes bakeries from listing in CityOffice
     * @param bakery Bakery to be removed
     */
    public void removeBakery(Bakery bakery) {
        localBakeries.remove(bakery);
    }

    /**
     * Returns List of all Bakeries registered in CityOffice
     * @return Arraylist of all registered Bakeries
     */
    public ArrayList<Bakery> getBakeries() {
        return localBakeries;
    }

    /**
     * Prints Name of CityOffice in certain format.
     */
    public void printName() {
        System.out.print("city office of [" + city + "]");
    }

    /**
     * Prints names of all bakeries registered in certain format
     */
    public void printAllBakeries() {

        for (int i = 0; i < localBakeries.size(); i++) {
            if (i == localBakeries.size() -1) {
                System.out.print("[" + localBakeries.get(i).getName() + "] ");
            } else {
                System.out.print("[" + localBakeries.get(i).getName() + "], ");
            }
        }

    }
}
