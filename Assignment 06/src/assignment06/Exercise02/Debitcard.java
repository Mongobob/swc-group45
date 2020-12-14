package assignment06.Exercise02;

import java.util.ArrayList;

public class Debitcard extends Payment{

    double balance;
    String pin;
    String owner;

    public Debitcard(String initpin, String initowner){
        this.pin=initpin;
        this.owner= initowner;
        this.balance=0;
    }

    public boolean pay(ArrayList<Product> alist){
        double totalprice =0;
        for (int i=0; i< alist.size();i++){
            totalprice = totalprice+  alist.get(i).getPrice();
        }
        return true;

    }
    public double getBalance(){
        return balance;
    }
}
