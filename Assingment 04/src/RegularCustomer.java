class RegularCustomer extends Customer{


    public RegularCustomer(String Name, String Surname, int Age, int BankAccountNumber, int Savings, int IDNumber, int CreditCardSerialNumber) {
        super(Name, Surname, Age, BankAccountNumber, Savings, IDNumber, 2000, CreditCardSerialNumber);

    }


    /**
     * They have a regular credit card and can only pay
     * up to 2000.- per transition. They don't have a limit
     * of the amount of using it
     * make an creditcard with all and an

     */

}
