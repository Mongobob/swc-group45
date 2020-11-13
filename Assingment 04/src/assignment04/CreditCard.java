package assignment04;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CreditCard {

    // general types and upperLimit for spending
    public enum CreditCardType {regular, gold, platinum};
    private final int[] upperLimit = {2000, 5000, 10000};

    // personal information about the owner of the CreditCard
    private final String name;
    private final String surname;

    // ID's and information for organisation
    private final long serialNumber;
    private final int securityCode; // 3 digits
    private Date expirationDate;
    private CreditCardType ccType;

    // constructor for CreditCards
    public CreditCard(String name, String surname, int ownerId, int securityCode, CreditCardType ccType){
        this.name = name;
        this.surname = surname;
        // all the CreditCards have the same ID as their owner, they just start with 96 000 ... (max. user = 999 999)
        this.serialNumber = 96000000 + ownerId;
        this.securityCode = securityCode;
        this.ccType = ccType;
        computeExpirationDate();
    }

    // basic getter methods to get information about the customer
    public String getName() {return name;}
    public String getSurname(){return surname;}
    public long getSerialNumber() {return serialNumber;}
    public Date getExpirationDate() {return expirationDate;}

    public int getSecurityCode(){
        if (securityCode > 1000 || securityCode < 100) {
            return 0;}
        else {return securityCode;}
    }

    // unique method that is only meant for this class, automatically makes every CreditCard for two years valid
    private void computeExpirationDate(){
        Date current = new Date();
        Date expDate = new Date();
        SimpleDateFormat DateFor = new SimpleDateFormat("dd/MM/yyyy");
        try{ // ... year counter starts at 1900 -> if we add 1902 every CreditCard is valid for 2 years
            expDate = DateFor.parse("01/" + current.getMonth() + "/" + (1902 + current.getTime()) );
        } catch (ParseException e) { // ... if fails CreditCard only valid for today
            e.printStackTrace();
        }
        this.expirationDate = expDate;
    }

    // check what kind of CreditCard it is
    public String getCCType() {
        String type = "";

        switch (ccType) {
            case regular  -> type += "regular";
            case gold     -> type += "gold";
            case platinum -> type += "platinum";
            default       -> type += "ERROR"; // if not => invalid CCType
        }

        return type;
    }

    // change what kind of CreditCard this is
    public void changeCCType(CreditCardType next){
        this.ccType = next;
    }

    // upper limit in correspondence with the CreditCard Type
    public int getLimit(){
        int limit = 0;

        switch (ccType) {
            case regular  -> limit = upperLimit[0];
            case gold     -> limit = upperLimit[1];
            case platinum -> limit = upperLimit[2];
            default       -> limit = 0; // if not => invalid CCType
        }

        return limit;
    }

    // additional method that checks if a CreditCard has expired or not
    public boolean isExpired(){
        Date current = new Date();
        return expirationDate.before(current);
    }

    /**
     * All the information given to us from the exercise for this class:
     *
     * Credit card: A credit card entity should contain the data of the owner (name and surname),
     * a serial number, a security code of three digits, and an expiration date. There are three
     * different types of credit cards: Regular credit card, Gold credit card, and Platinum credit
     * card.
     */

}
