package assignment04;

public class RegularEmployee extends BankEmployee{

    protected RegularEmployee(String Name, String Surname, EmployeeCounter EmployeeID) {
        super(Name, Surname, EmployeeID);
    }
}
/** can only upgrade from regular to golden nothing else
 */