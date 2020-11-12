package assignment04;

public class PlatinumCustomer extends Customer {


    protected PlatinumCustomer(String Name, String Surname, int Age, int BankAccountNumber, int Savings, int IDNumber,int CreditCardSerialNumber) {
        super(Name, Surname, Age, BankAccountNumber, Savings, IDNumber, 10000, CreditCardSerialNumber);
    }
    /**They have a regular credit card and can only pay
     * up to 10000.- per transition. They don't have a limit
     * of the amount of using it
     */
}
