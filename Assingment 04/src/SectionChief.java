public class SectionChief extends BankEmployee{

    private final String City;

    protected SectionChief(String Name, String Surname, EmployeeCounter EmployeeID, String City) {

        super(Name, Surname, EmployeeID);
        this.City = City;
    }

    public String getCity() {
        return City;
    }

}




/**
 * need a function that can upgrade from golden to platinum
 * and a downgrade from golden to regular
 */
