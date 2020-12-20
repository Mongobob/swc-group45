package assignment06.Exercise02;

import java.util.ArrayList;

public class Shoppingcart {
    private ArrayList<Product> cart;

    public Shoppingcart(){}

    public void addToCart(Product prod){
        cart.add(prod);
    }
    public void showCart(){
        for (int i =0; i< cart.size();i++){
            System.out.print(cart.get(i).getName());
        }
    }
    public void removeFromCart(Product product){
        cart.add(product);
    }
    public ArrayList<Product> buyProducts(){
        return cart;
    }
}
