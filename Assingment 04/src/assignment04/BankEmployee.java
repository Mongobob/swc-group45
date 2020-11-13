package assignment04;

import java.util.ArrayList;

public interface BankEmployee {

    String getName();
    String getSurname();
    int getIDNumber();
    ArrayList<Customer> myCustomers();
    boolean upgradeToGold(int id);

}

/**
 * All the information given to us from the exercise for this class:
 *
 * Bank employee: bank employees supervise all the operations in the bank. Each employee
 * has a name, surname, identification number, and a list of customers assigned to them. They
 * can upgrade a customer from Regular level to Golden level given the Customer ID.
 * Employees are divided in three levels:
 *
 * 1) Regular employee : they do not have any special characteristic.
 *
 * 2) Section chief : each Section chief is assigned to a different city. In addition to being
 * able to perform any regular employee's actions, a section chief can downgrade the
 * level of a customer from Gold to Regular given the customer ID. Furthermore,
 * differently from a regular employee, a section chief can upgrade a customer level
 * from Golden to Platinum.
 *
 * 3) Main Chief: The main chief can perform all actions of a section chief but they are not
 * assigned to any city. Moreover, they can downgrade a customer from Platinum level
 * to any previous level (Golden or Regular).
 */