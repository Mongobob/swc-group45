package assignment04;

public class SectionChief extends RegularEmployee{

    /**
     * need a function that can upgrade from golden to platinum
     * and a downgrade from golden to regular
     */

    // new field because a section chief is responsible for an entire city
    private final String city;

    // constructor that calls the constructor of the super class
    protected SectionChief(String name, String surname, String city) {
        super(name, surname);
        this.city = city;
    }

    // find out for which city someone is responsible
    public String getCity() {
        return city;
    }

    // can upgrade customers to the highest level
    public boolean upgradeToPlatinum(int id) {
        boolean successful = false;
        Customer a = Archive.getInstance().getCustomer(id);

        if(a.getMyType() == Customer.CustomerType.gold) {
            a.changeCustomerType(Customer.CustomerType.platinum);
            a.getCC().changeCCType(CreditCard.CreditCardType.platinum);
            successful = true;
        }

        return successful;

    }

    // can downgrade customers from the medium to the lowest level
    public boolean downgradeToRegular(int id) {
        boolean successful = false;
        Customer a = Archive.getInstance().getCustomer(id);

        if(a.getMyType() == Customer.CustomerType.gold) {
            a.changeCustomerType(Customer.CustomerType.regular);
            a.getCC().changeCCType(CreditCard.CreditCardType.regular);
            successful = true;
        }

        return successful;

    }
}





