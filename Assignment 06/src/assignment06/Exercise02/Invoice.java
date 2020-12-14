package assignment06.Exercise02;

import java.util.ArrayList;

public class Invoice extends Payment {
    String IBAN;
    String Address;

    public boolean pay(ArrayList<Product> alist){
        double totalprice =0;
        for (int i=0; i< alist.size();i++){
            totalprice = totalprice+  alist.get(i).getPrice();
        }
        return true;

    }

}
