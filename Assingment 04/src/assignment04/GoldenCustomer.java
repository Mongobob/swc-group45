package assignment04;

public class GoldenCustomer extends Customer {


    protected GoldenCustomer(String Name, String Surname, int Age, int BankAccountNumber, int Savings, CustomerCounter IDNumber, int CreditCardSerialNumber) {
        super(Name, Surname, Age, BankAccountNumber, Savings, IDNumber, 5000, CreditCardSerialNumber);
    }
    /**
     * They have a golden credit card and can only pay
     * up to 5000.- per transition. They don't have a limit
     * of the amount of using iC
     *
     */
}
