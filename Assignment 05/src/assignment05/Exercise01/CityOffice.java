package assignment05.Exercise01;
import java.util.ArrayList;

public class CityOffice {
    private ArrayList<Bakery> localBakeries = new ArrayList();
    private String city;

    public CityOffice(String city) {
        this.city = city;
    }

    public String getCity() {
        return city;
    }

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

    public void removeBakery(Bakery bakery) {
        localBakeries.remove(bakery);
    }

    public ArrayList<Bakery> getBakeries() {
        return localBakeries;
    }

    public void printName() {
        System.out.print("city office of [" + city + "]");
    }

    public ArrayList<Bakery> getAllBakeries() {
        return localBakeries;
    }


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
