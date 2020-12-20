package assignment06.Exercise02;

import java.util.ArrayList;

public class CreditCard extends Payment{
    private double balancecap;

    public CreditCard(Customer initowner, double initbalancecap, String initpin){
        pin=initpin;
        this.balancecap=initbalancecap;
        owner=initowner;
    }
    public double getBalancecap(){return balancecap;}


}
