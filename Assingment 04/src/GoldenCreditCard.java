public class GoldenCreditCard extends CreditCard {
    protected GoldenCreditCard(String Name, String Surname, int SerialNumber, int SecurityCode, String ExpirationDate) {
        super(Name, Surname, SerialNumber, SecurityCode, ExpirationDate, 5000);
    }
}
