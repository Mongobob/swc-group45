package assignment06.Exercise02;

import java.util.ArrayList;

public class NormalCustomer extends Customer {
    public int itemcap;
    protected String password;
    protected String customername;
    private ArrayList<Product> shoppingcart;
    public ProductList prodlist;

    private NormalCustomer(String initcustomername,int inititemcap, String initpassword, ProductList initprodlist){
        this.itemcap = inititemcap;
        this.password = initpassword;
        this.customername = initcustomername;
        this.prodlist = initprodlist;
    }


}
