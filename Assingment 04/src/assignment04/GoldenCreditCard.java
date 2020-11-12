package assignment04;

import java.time.YearMonth;

public class GoldenCreditCard extends CreditCard {
    protected GoldenCreditCard(String Name, String Surname, int SerialNumber, int SecurityCode, YearMonth ExpirationDate) {
        super(Name, Surname, SerialNumber, SecurityCode, ExpirationDate, 5000);
    }
}
