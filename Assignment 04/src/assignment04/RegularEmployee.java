package assignment04;

import java.util.ArrayList;

public class RegularEmployee implements BankEmployee {

    // information about the employee
    private final String name;
    private final String surname;
    private final int id;
    private ArrayList<Customer> myCustomers;

    // constructor method
    public RegularEmployee(String name, String surname) {
        this.name = name;
        this.surname = surname;
        this.id = EmployeeCounter.getInstance().getEmployeeID();
        this.myCustomers = new ArrayList<Customer>();

        // add this new employee in the archive
        Archive.getInstance().addEmployee(this.id, this);
    }

    // basic getter methods to get information about the employee
    public String getName() { return name; }
    public String getSurname() { return surname; }
    public int getIDNumber(){ return id; }
    public ArrayList<Customer> myCustomers() { return myCustomers; }

    /**
     * can only upgrade from regular to golden nothing else
     */
    public boolean upgradeToGold(int id) {

        boolean successful = false;
        Customer a = Archive.getInstance().getCustomer(id);

        if(a.getMyType() == Customer.CustomerType.regular) {
            a.changeCustomerType(Customer.CustomerType.gold);
            a.getCC().changeCCType(CreditCard.CreditCardType.gold);
            successful = true;
        }

        return successful;

    }
}