package src.assignment05.Exercise01;

public class SellItem {
    private int type =-1;
    public SellItem(int bakerytype) {
        /**
         * Normal Bakery: 0
         * BreadBakery: 1
         * Sweetsbakery: 2
         */
        if (bakerytype == 0 || bakerytype == 1 || bakerytype == 2) {
            this.type = bakerytype;
        }
    }
    public double sellSandwich(int ham, int tomatoes, int cheese, int tuna){
        if ((ham>=0 && tomatoes>=0 && cheese>=0 && tuna>=0)&& (this.type==0 || this.type==1)){
            double price = 0;
            price = price + ham*2+ tomatoes*1.5 + cheese*1 + tuna*3;
            return price;
        }
        else{
            System.out.println("invalid input, toppings have to be positive");
            return -1;
        }

    }

    public double sellCake(int strawberries, int cream, int chocolate){
        if ((strawberries>=0 && cream>=0 && chocolate>=0)&&(this.type==0 || this.type==2)){
            double price = 3;
            price = price + strawberries*1+ cream*1.5 + chocolate*2;
            return price;
        }
        else {
            System.out.println("invalid input, toppings have to be positive");
            return -1;
        }

    }

}
