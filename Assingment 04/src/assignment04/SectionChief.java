package assignment04;

public class SectionChief extends BankEmployee{

    private final String City;

    protected SectionChief(String Name, String Surname, int IDNumber, String City) {

        super(Name, Surname, IDNumber);
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
