package assignment06.Exercise02;

import java.util.ArrayList;

public class Invoice extends Payment {
    private String IBAN;
    private String Address;

    public Invoice(String initIBAN, String initAdress,Customer initowner){
        this.IBAN=initIBAN;
        this.Address=initAdress;
        owner=initowner;
    }
    public String getIBAN(){return IBAN;}
    public String getAddress(){return Address;}



}
