public class Customer implements DoingOptions {

    private final String Name;
    private final String Surname;
    private int Age;
    private final int BankAccountNumber;
    private float Savings;
    private final int IDNumber;
    private final int CreditCardType;
    private final int CreditCardSerialNumber;





    protected Customer(String Name, String Surname, int Age, int BankAccountNumber, int Savings,
                       int IDNumber, int CreditCardType, int CreditCardSerialNumber){

        this.Name = Name;
        this.Surname = Surname;
        this.Age = Age;
        this.BankAccountNumber = BankAccountNumber;
        this.Savings = Savings;
        this.IDNumber = IDNumber;
        this.CreditCardType = CreditCardType;
        this.CreditCardSerialNumber =CreditCardSerialNumber;
    }

    public String getName(){return Name;}
    public String getSurname(){return Surname;}
    public int getAge(){return Age;}
    public int getBankAccountNumber(){return BankAccountNumber;}
    public float getSavings(){return Savings;}
    public int getIDNumber(){return IDNumber;}
    public int getCCType(){return CreditCardType;}



    public boolean Withdraw(float WAmount){
        if (WAmount > Savings){
            return false;
        }
        else Savings = Savings-WAmount;
            return true;}

    public float Deposit(float DAmount){
        Savings = Savings+DAmount;
        return Savings;}

    @Override
    public boolean PayingWithCC(int CCAmount) {
        return !(CCAmount > CreditCardType);
    }

    @Override
    public boolean PayingWithBank(int BAmount) {
        return !(Savings < BAmount);
    }


    public int getCreditCardSerialNumber() {
        return CreditCardSerialNumber;
    }



    /**public boolean PayingWithCC(int CCAmount){
        return Withdraw() <= CreditCardType;
    };
    public int PayingWithBank(int BankAmount){return Savings-BankAmount;}

    /** this should be the super class for the customers so we can Inherit them
    they need:  Name:
                Surname:
                Bank account number:
                Age:
                Amount of savings if available:
                Unique ID number:
                Type of credit Card (depending of level):
                They can only deposit or withdraw cash.
                List of the track what the customer did
    */

}
