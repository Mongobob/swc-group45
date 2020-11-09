public class PlatinumCreditCard extends CreditCard {
    protected PlatinumCreditCard(String Name, String Surname, int SerialNumber, int SecurityCode, String ExpirationDate) {
        super(Name, Surname, SerialNumber, SecurityCode, ExpirationDate, 10000);
    }
}
