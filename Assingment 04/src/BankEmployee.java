public class BankEmployee {

     private final String Name;
     private final String Surname;
     private final int IDNumber;




    /**
     We have to conect the customer to a Bankemployee that means like a 1:n connection
     */

    /** we need an upgrade methond that upgrades only regular to golden given the Customers ID
     */

    protected BankEmployee(String Name, String Surname, int IDNumber){
        this.Name = Name;
        this.Surname = Surname;
        this.IDNumber = IDNumber;
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