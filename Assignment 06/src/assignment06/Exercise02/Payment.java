package assignment06.Exercise02;

import java.util.ArrayList;

public abstract class Payment {
    String pin;
    Customer owner;
    double balance = 0;

    public boolean pay(ArrayList<Product> alist){
        double priceAll =0;
        for (int i=0;i<alist.size();i++){
            priceAll+=alist.get(i).getPrice();
        }
        if(priceAll<=balance){
            balance-=priceAll;
            return true;
        }
        return false;
    }
    public void receiveMoney(double price){
        balance+=price;
    }
    public Customer getOwner(){return owner;}
    public double getBalance(){return balance;}


}
