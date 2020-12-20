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


    @Override
    public void sellProduct() {

    }

    @Override
    public void buyProduct() {

    }

    @Override
    public void addToCart(Product product) {

    }

    @Override
    public void removeFromCart(Product product) {

    }

    @Override
    public void addPaymentmethod(Payment payment) {

    }

    @Override
    public void removePaymentmethod(Payment payment) {

    }

    @Override
    public String getName() {
        return null;
    }
}
