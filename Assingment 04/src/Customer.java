import javax.sound.midi.Track;

public class Customer implements DoingOptions {

    private final String Name;
    private final String Surname;
    private int Age;
    private final int BankAccountNumber;
    private int Savings;
    private final int IDNumber;
    private final String CreditCardType;
    /** TODO need something to track the customers data
     */



    protected Customer(String Name, String Surname, int Age, int BankAccountNumber, int Savings,
                       int IDNumber, String CreditCardType){

        this.Name = Name;
        this.Surname = Surname;
        this.Age = Age;
        this.BankAccountNumber = BankAccountNumber;
        this.Savings = Savings;
        this.IDNumber = IDNumber;
        this.CreditCardType = CreditCardType;



    }

    public String getName(){return Name;}
    public String getSurname(){return Surname;}
    public int getAge(){return Age;}
    public int getBankAccountNumber(){return BankAccountNumber;}
    public int getSavings(){return Savings;}
    public int getIDNumber(){return IDNumber;}
    public String getCCType(){return CreditCardType;}
    public int Withdraw(int WAmount){return Savings-Withdraw(WAmount);}
    public int Deposit(int DAmount){return Savings+Deposit(DAmount);}

    @Override
    public boolean PayingWithCC(int CCAmount) {
        return false;
    }

    @Override
    public int PayingWithBank(int BAmount) {
        return 0;
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
