package assignment06.Exercise02;

import assignment05.Exercise01.CentralOffice;

import java.util.ArrayList;

public class ProductList {
    private ArrayList<Product> allProducts;
    private volatile static ProductList uniqueInstance;

    private ProductList(){}

    public static ProductList getInstance(){
        if (uniqueInstance == null){
            synchronized (CentralOffice.class){
                if (uniqueInstance==null){
                    uniqueInstance = new ProductList();
                }
            }
        }
        return uniqueInstance;
    }

    public void addProduct(Product product){
        allProducts.add(product);
    }
    public void removeProduct(Product product){
        allProducts.remove(product);
    }




}
