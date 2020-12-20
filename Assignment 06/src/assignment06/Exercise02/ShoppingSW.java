package assignment06.Exercise02;


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
            synchronized (ShoppingSW.class) {
                if (uniqueInstance == null) {
                    uniqueInstance = new ShoppingSW();
                }
            }
        }
        return uniqueInstance;
    }

    public void sellProduct(Product product) {
        productList.addProduct(product);
    }
    public ArrayList<Product> buyProduct(Shoppingcart cart) {
        for (int i = 0; i < cart.buyProducts().size(); i++) {
            if (!productList.containsProduct(cart.buyProducts().get(i))) {
                throw new UnsupportedOperationException();
            } else {
                productList.removeProduct(cart.buyProducts().get(i));
                cart.buyProducts().get(i).getSeller().removeFromCart(cart.buyProducts().get(i));
            }
            }

            return cart.buyProducts();
        }


    public boolean isloggedin(Customer customer){
        if (customerlist.contains(customer)) {
            return true;
        }
        return false;
    }
    public boolean login(String password, Customer customer) {
        if (customer.getPassword()==password){
            customerlist.add(customer);
            return true;
        }
        return false;
    }
    public boolean logout(String password, Customer customer){
        if (customer.getPassword()==password){
            customerlist.remove(customer);
            return true;
        }
        return false;
    }
}

