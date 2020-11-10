import java.time.YearMonth;

public class RegularCreditCard extends CreditCard{
    protected RegularCreditCard(String Name, String Surname, int SerialNumber, int SecurityCode, YearMonth ExpirationDate) {
        super(Name, Surname, SerialNumber, SecurityCode, ExpirationDate, 2000);
    }
}
