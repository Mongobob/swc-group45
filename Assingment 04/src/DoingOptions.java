public interface DoingOptions {

    String getName();
    String getSurname();
    int getAge();
    int getBankAccountNumber();
    float getSavings();
    int getIDNumber();
    int getCCType();
    boolean Withdraw(float WAmount);
    float Deposit(float DAmount);
    boolean PayingWithCC(int CCAmount);
    boolean PayingWithBank(int BAmount);
    int getEmployeeID();



}
