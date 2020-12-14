package assignment06.Exercise02;

import java.util.ArrayList;

public class CreditCard extends Payment{
    double balance;
    double balancecap;
    String pin;
    String Owner;

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
