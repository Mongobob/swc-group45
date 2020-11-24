package assignment05.Exercise01;

import java.util.ArrayList;

public class CentralOffice {
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

    public void addOffice(CityOffice cityoffice){
        for (int i =0; i<allOffices.size();i++){
            if(cityoffice.getCity().equals(allOffices.get(i).getCity())){
                System.out.print("there's already an office registered in this city");
                throw new UnsupportedOperationException();
            }
        }
        allOffices.add(cityoffice);
    }
    public void removeBakery(CityOffice cityoffice){
        allOffices.remove(cityoffice);
    }
    public ArrayList<CityOffice> getAllOffices(){
        return allOffices;
    }


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
