package assignment04;

public class CustomerCounter {

    private static CustomerCounter uniqueInstance;

    private int customerID = 0;

    // instance variables coming here
    private CustomerCounter(){}

    public static CustomerCounter getInstance(){
        if (uniqueInstance == null){
            uniqueInstance = new CustomerCounter();
        }

        return uniqueInstance;
    }

    public int getCustomerID() {
        return customerID++;
    }

    public void resetID() {
        customerID = 0;
    }

}

