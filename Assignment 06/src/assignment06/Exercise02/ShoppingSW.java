package assignment06.Exercise02;

import assignment05.Exercise01.CentralOffice;

import java.util.ArrayList;

public class ShoppingSW {
    private ArrayList<Customer> customerlist;
    private Searchbar searchbar;
    public ProductList productList = ProductList.getInstance();

    private volatile static ShoppingSW uniqueInstance;

    private ShoppingSW() {
    }

    public static ShoppingSW getInstance() {
        if (uniqueInstance == null) {
            synchronized (CentralOffice.class) {
                if (uniqueInstance == null) {
                    uniqueInstance = new ShoppingSW();
                }
            }
        }
        return uniqueInstance;
    }
}


/**
    public void addCustomer(String name,String password,String level){
        if (level =="normal"){
            NormalCustomer custom();
        }
    }
    public Customer login(String password, String clientname)}
*/