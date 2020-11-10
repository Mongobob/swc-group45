import java.util.ArrayList;

public class RegularEmployee extends BankEmployee{

    protected RegularEmployee(String Name, String Surname, int IDNumber) {
        super(Name, Surname, IDNumber);
    }
}
/** can only upgrade from regular to golden nothing else
 */