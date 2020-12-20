package assignment06.Exercise02;

import java.util.ArrayList;

public class Banktransfer extends Payment{
    private String accountnumber;
    public Banktransfer(Customer initowner, String initpin, String initaccountnumber){
        pin=initpin;
        owner=initowner;
        this.accountnumber=initaccountnumber;
    }
    public String getAccountnumber(){return accountnumber;}



}
