package assignment04;

import java.time.YearMonth;

public class CreditCard {

    private final String Name;
    private final String Surname;
    private final int SerialNumber;
    private final int SecurityCode; // 3 digits
    private final YearMonth ExpirationDate;
    private final int CCType;

    protected CreditCard(String Name, String Surname, int SerialNumber, int SecurityCode, YearMonth ExpirationDate, int CCType){
        this.Name = Name;
        this.Surname = Surname;
        this.SerialNumber = SerialNumber;
        this.SecurityCode = SecurityCode;
        this.ExpirationDate = ExpirationDate;
        this.CCType = CCType;

    }

    public String getName() {return Name;}

    public String getSurname(){return Surname;}

    public int getSerialNumber() {return SerialNumber;}

    public int getSecurityCode(){
        if (SecurityCode > 1000 || SecurityCode < 100) {
            return 0;}
        else {return SecurityCode;}
    }

    public int getCCType() {return CCType;}

    public YearMonth getExpirationDate() {return ExpirationDate;}

    /**
     * Check if the credit Card is valid means is the Expiration date valid
     */

}
