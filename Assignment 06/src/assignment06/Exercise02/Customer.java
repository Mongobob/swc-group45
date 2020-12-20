package assignment06.Exercise02;

import java.util.ArrayList;

public abstract class Customer{
    protected int itemcap;
    protected String password;
    protected String customername;
    protected Shoppingcart shoppingcart = new Shoppingcart();
    protected ShoppingSW shoppingSW;
    protected ArrayList<Payment> paymentmethods;
    protected Payment currentpaymentmethod;
    protected ArrayList<Product> itemsForSale;

    public void sellProduct(Product product){
        if(itemsForSale.size()<itemcap) {
            if (shoppingSW.isloggedin(this)) {
                shoppingSW.sellProduct(product);
            }
        }
        itemsForSale.add(product);

    }
    public void removeItemForsale(Product product){
        itemsForSale.remove(product);
        currentpaymentmethod.receiveMoney(product.getPrice());
    }
    public ArrayList<Product> buyProduct(){
        currentpaymentmethod.pay(shoppingcart.buyProducts());
        return shoppingSW.buyProduct(shoppingcart);
    }
    public void addToCart(Product product) {
        shoppingcart.addToCart(product);
    }
    public void removeFromCart(Product product){
        shoppingcart.removeFromCart(product);
    }
    public String getPassword(){
        return password;
    }
    public void addPaymentmethod(Payment payment){
        paymentmethods.add(payment);
    }
    public void removePaymentmethod(Payment payment){
        paymentmethods.remove(payment);
    }
    public void selectCurrentPaymentmethod(Payment payment){
        currentpaymentmethod = payment;
    }

    public String getName(){
        return customername;
    }



}
