package assignment04;

import java.util.ArrayList;

/**
 * This is a new additional class. The archive stores all the employees
 * and all the customers in list which are accessible via certain methods.
 */
public class Archive {

    // the archive itself
    private static Archive uniqueInstance;

    // the list of all the customers
    private ArrayList<Customer> customerList = new ArrayList<Customer>();

    // the list of all the employees
    private ArrayList<BankEmployee> employeeList = new ArrayList<BankEmployee>();


    public static Archive getInstance(){
        if (uniqueInstance == null){
            uniqueInstance = new Archive();
        }

        return uniqueInstance;
    }

    // returns the customer at the 'id'th position of the array
    public Customer getCustomer(int id){
        return customerList.get(id);
    }

    // add a new customer at the 'id'th position of the array, id's and position must match
    public boolean addCustomer(int id, Customer c){
        boolean successful = false;

        if(id == c.getId()) {
            customerList.add(id, c);
            successful = true;
        }

        return successful;
    }

    // returns the employee at the 'id'th position of the array
    public BankEmployee getEmployee(int id){
        return employeeList.get(id);
    }

    // add a new employee at the 'id'th position of the array, id's and position must match
    public boolean addEmployee(int id, BankEmployee b){
        boolean successful = false;

        if(id == b.getIDNumber()) {
            employeeList.add(id, b);
            successful = true;
        }

        return successful;
    }

}
