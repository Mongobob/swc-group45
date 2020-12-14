package assignment06.Exercise02;

import java.util.ArrayList;

public class Searchbar{
    private ArrayList<Product> productlist;
    private ArrayList<Product> templist;

    public Searchbar(ArrayList<Product> initlist){
        this.productlist=initlist;
    }
    public Product stringsearch(String searchname){
        for (int i=0; i<productlist.size();i++){
            if (searchname==productlist.get(i).getName()){
                return productlist.get(i);
            }
        }
        throw new ArrayIndexOutOfBoundsException();
    }
    public ArrayList<Product> filter(String productName){
        for (int i=0; i<productlist.size();i++){
            if (productlist.get(i).getClass().getSimpleName().equals(productName)){
                templist.add(productlist.get(i));
            }
        }
        return templist;
    }
}
