public interface DoingOptions {

    String getName();
    String getSurname();
    int getAge();
    int getBankAccountNumber();
    int getSavings();
    int getIDNumber();
    int getCCType();
    int Withdraw(int WAmount);
    int Deposit(int DAmount);
    boolean PayingWithCC(int CCAmount);
    boolean PayingWithBank(int BAmount);



}
