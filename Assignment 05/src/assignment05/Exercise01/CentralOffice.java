package assignment05.Exercise01;

import java.util.ArrayList;

public class CentralOffice {
    /**
     * This class represents the Central Office where all CityOffices are registered.
     * It saves and handles all CityOffices with their respective Bakeries
     * Since it should exist only once, it is implemented as singleton.
     */
    private ArrayList<CityOffice> allOffices = new ArrayList();
    private volatile static CentralOffice uniqueInstance;

    private CentralOffice(){}

    public static CentralOffice getInstance(){
        if (uniqueInstance == null){
            synchronized (CentralOffice.class){
                if (uniqueInstance==null){
                    uniqueInstance = new CentralOffice();
                }
            }
        }
        return uniqueInstance;
    }

    /**
     * Adds CityOffice to list of all CityOffices
     * @param cityoffice class Cityoffice
     * @throws exception if CityOffice tried to be registered twice in the same city
     */
    public void addOffice(CityOffice cityoffice){
        for (int i =0; i<allOffices.size();i++){
            if(cityoffice.getCity().equals(allOffices.get(i).getCity())){
                System.out.print("there's already an office registered in this city");
                throw new UnsupportedOperationException();
            }
        }
        allOffices.add(cityoffice);
    }

    /**
     * Removes bakery from Listing of CentralOffice
     * @param cityoffice Class Cityoffice to be removed from Listing in CentralOffice
     */
    public void removeBakery(CityOffice cityoffice){
        allOffices.remove(cityoffice);
    }
    public ArrayList<CityOffice> getAllOffices(){
        return allOffices;
    }

    /**
     * Prints all Cityoffices with their respective bakeries in a certain format
     */
    public void printAllOffices() {
        for (int i = 0; i < allOffices.size(); i++) {
            if (i == allOffices.size() - 1 && i == 0) {
                System.out.print("[");
                allOffices.get(i).printName();
                System.out.print("], ");
                allOffices.get(i).printAllBakeries();
            }
        }
        System.out.print("\n");
    }

}
