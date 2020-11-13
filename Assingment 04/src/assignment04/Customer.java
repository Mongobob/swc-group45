package assignment04;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class Customer {

    // general types
    public enum CustomerType {regular, gold, platinum}

    // personal information about the customer
    private final String name;
    private final String surname;
    private Date birthDay;
    private float savings;

    // ID's and information for organisation
    private final long bankAccountNumber;
    private final int IDNumber;
    private final int employeeID;
    private CustomerType myType;

    // the CreditCard of the customer
    private CreditCard creditCard;


    // constructor to create a new customer (WARNING: Will cause error down the line if used before there is a single employee.)
    protected Customer(String name, String surname, String birthDay, float savings,
                       CustomerType cType, int pin){

        // Initializing all the general fields
        this.name = name;
        this.surname = surname;
        this.savings = savings;

        // ... and the birthday of a person
        Date date = new Date();
        SimpleDateFormat DateFor = new SimpleDateFormat("dd/MM/yyyy");

        try{
            date = DateFor.parse(birthDay); // the String for the birthday must have the form dd/MM/yyyy ,ex. 13/07/1983
        } catch (ParseException e) { // ... otherwise the birthDay is just going to be today's date.
            // e.printStackTrace(); // uncomment for debugging
        }

        // Initializing all the fields needed for organization
        this.IDNumber = CustomerCounter.getInstance().getCustomerID();
        this.bankAccountNumber = 84000000 + IDNumber;
        this.employeeID = getServed(); // ID of the employee who's going to be responsible for us
        this.myType = cType;

        // Depending on customer type generate a different CreditCard
        CreditCard.CreditCardType ccType;

        switch (cType) {
            case gold     -> ccType = CreditCard.CreditCardType.gold;
            case platinum -> ccType = CreditCard.CreditCardType.platinum;
            default       -> ccType = CreditCard.CreditCardType.regular; // if regular or not specified => regular
        }

        this.creditCard = new CreditCard(name, surname, this.IDNumber, pin, ccType);

        // finally add the new customer to the archive
        Archive.getInstance().addCustomer(this.IDNumber, this);
    }


    // basic getter methods to get information about the customer
    public String getName() { return name; }
    public String getSurname() { return surname; }
    public float getSavings() { return savings; }

    public long getBankAccountNumber() { return bankAccountNumber; }
    public int getId() { return IDNumber; }
    public int getEmployeeID() { return employeeID; }
    public CustomerType getMyType() { return myType; }

    public CreditCard getCC() { return creditCard; }


    // ... unique method to calculate age
    public int getAge(){
        Date current = new Date();

        int age = current.getYear() - birthDay.getYear();
        // unnecessarily complex calculation to figure out if a person had his/her birthday this year
        if(current.getTime() - (birthDay.getTime() + (86400000 * age))  > 0) {
            age--;
        }

        return age;
    }

    // (1) add amount to your savings
    public void deposit(float amount) {
        savings = savings + amount;
    }

    // (2) withdraw amount if there are enough savings
    public float withdraw(float amount) {
        if (amount > savings) { // not enough money on the bankAccount
            return 0;
        } else { // enough money
            savings = savings - amount;
            return amount;
        }
    }

    // (3) bank transfer paying successful if there are enough savings
    public void payingWithTransfer(float amount) {
        if (amount <= savings) { // enough money -> transfer money
            savings = savings - amount;
        }
        // not enough money -> nothing happens
    }

    // (4) CreditCard paying works as long as the amount is below the upper limit
    public void payingWithCC(float amount) {
        if (amount <= creditCard.getLimit()) { // below limit -> transfer money
            savings = savings - amount;
        }
        // above limit -> nothing happens
    }

    // change customer type and his CreditCard
    public void changeCustomerType(CustomerType next) {
        this.myType = next;

        // Depending on customer type generate a different CreditCard
        CreditCard.CreditCardType nextCCType;

        switch (next) {
            case gold     -> nextCCType = CreditCard.CreditCardType.gold;
            case platinum -> nextCCType = CreditCard.CreditCardType.platinum;
            default       -> nextCCType = CreditCard.CreditCardType.regular; // if regular or not specified => regular
        }

        creditCard.changeCCType(nextCCType);
    }

    // unique additional method which assigns a new customer at random to an employee and
    // save him/her in the list of said employee
    private int getServed() {
        Random rand = new Random();
        int empId = rand.nextInt(Archive.getInstance().amountEmployee()); // randomly decide which of our employees gets this customer
        Archive.getInstance().getEmployee(empId).myCustomers().add(this); // assign customer in list of employee
        return empId; // return id of the responsible employee
    }

}

/**
 * All the information given to us from the exercise for this class:
 *
 * In this assignment, you are going to create the structure of a bank management system.
 * The system must include the following entities:
 *
 * Customer: The system must keep track of the data of a customer. The data to save are the
 * customer's name, surname, age, bank account number and their savings (i.e., the amount of
 * money available to the customer). Moreover, each customer is identified by a unique
 * Identification Number (ID).
 * Each customer has a different type of credit card (depending on the customer's level). The
 * customer can deposit and withdraw cash, use their credit cards, and pay the bills using a
 * bank transfer. The customer's actions follow these rules:
 *
 * ● Depositing money simply adds the sum of money deposited to the customer's
 * savings. (1)
 *
 * ● Withdrawing money removes the specified sum to the customer's savings. A
 * customer can not withdraw more than the amount of their savings. Withdrawing
 * money returns the amount of money withdrawn. (2)
 *
 * ● Paying with bank transfer is only allowed if the customer has enough savings to pay
 * the specified amount of money. However, the method subtracts the paid amount from
 * the customer's savings, but it does not return the amount of money paid. (3)
 *
 * ● Paying by credit cards is always allowed, regardless of the amount of money
 * available in the customer's savings. However, a customer can not pay more than the
 * amount allowed by its credit card for each transaction (e.g., 2000 CHF for a regular
 * credit card, as specified below). (4)
 *
 * There are three possible level of customers, which can perform different actions:
 *
 * 1. Regular customer : they have a Regular Credit Card and can pay only up to
 * 2000 CHF by credit card per transaction. Payments with bank transfer do not
 * have an amount limit.
 *
 * 2. Golden customer : they have a Gold Credit Card and can pay up to 5000
 * CHF by credit card per transaction. Payments with bank transfer do not have
 * an amount limit.
 *
 * 3. Platinum customer : they have a Platinum Credit Card and can pay up to
 * 10000 CHF by credit card per transaction. Payments with bank transfer do
 * not have an amount limit.
 *
 * To successfully complete a payment by credit card, the credit card must not be expired.
 *
 */
