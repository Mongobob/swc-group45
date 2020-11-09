public class CreditCard {

    private final String Name;
    private final String Surname;
    private final int SerialNumber;
    private final int SecurityCode; // 3 digits
    private final String ExpirationDate;
    private final int CCType;

    protected CreditCard(String Name, String Surname, int SerialNumber, int SecurityCode, String ExpirationDate, int CCType){
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
        if (SecurityCode > 1000 || SecurityCode < 0) {
            return 0;}
        else {return SerialNumber;}
    }

    public int getCCType() {return CCType;}

    public String getExpirationDate() {return ExpirationDate;}

}
