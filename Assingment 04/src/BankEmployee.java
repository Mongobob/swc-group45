import java.awt.*;
import java.util.ArrayList;

public class BankEmployee {

     private final String Name;
     private final String Surname;
     private final int IDNumber;
     private ArrayList<String> ListOfCustomers = new ArrayList<String>(); //List where all the employee's are stored


    /**
     We have to connect the customer to a Bankemployee that means like a 1:n connection
     */

    //TODO we need an upgrade method that upgrades regular to golden given the Customers ID, because every Empl. can do this


    protected BankEmployee(String Name, String Surname, EmployeeCounter IDNumber){
        this.Name = Name;
        this.Surname = Surname;
        this.IDNumber = IDNumber.getEmployeeID();

    }

    public String getName() {
        return Name;
    }

    public String getSurname() {
        return Surname;
    }

    public int getIDNumber() {
        return IDNumber;
    }

}