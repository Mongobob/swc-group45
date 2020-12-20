package assignment06.Exercise02;


import java.util.ArrayList;

public class ProductList {
    private ArrayList<Product> allProducts;
    private volatile static ProductList uniqueInstance;

    private ProductList(){}

    public static ProductList getInstance(){
        if (uniqueInstance == null){
            synchronized (ProductList.class){
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
    public ArrayList<Product> listProuducts(){
        return allProducts;
    }
    public boolean containsProduct(Product product){
        for(int i=0; i<allProducts.size();i++){
            if(allProducts.get(i).equals(product)){
                return true;
            }
        }
        return false;
    }




}
