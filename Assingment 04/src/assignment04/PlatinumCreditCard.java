package assignment04;

import java.time.YearMonth;

public class PlatinumCreditCard extends CreditCard {
    protected PlatinumCreditCard(String Name, String Surname, int SerialNumber, int SecurityCode, YearMonth ExpirationDate) {
        super(Name, Surname, SerialNumber, SecurityCode, ExpirationDate, 10000);
    }
}
