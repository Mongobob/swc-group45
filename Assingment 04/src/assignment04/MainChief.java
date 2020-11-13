package assignment04;

public class MainChief extends RegularEmployee {

    /**
     * all the methods that the section chief has and a method that can up and
     * downgrade from platinum to regular and upgrade method from regular to platinum
     */

    // constructor that calls the constructor of the super class
    protected MainChief(String name, String surname) {
        super(name, surname);
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

    // can downgrade customers from the medium and the highest level to the lowest level
    public boolean downgradeToRegular(int id) {
        boolean successful = false;
        Customer a = Archive.getInstance().getCustomer(id);

        if(a.getMyType() == Customer.CustomerType.gold || a.getMyType() == Customer.CustomerType.platinum) {
            a.changeCustomerType(Customer.CustomerType.regular);
            a.getCC().changeCCType(CreditCard.CreditCardType.regular);
            successful = true;
        }

        return successful;

    }

    // can downgrade customers from the the highest level to the medium level
    public boolean downgradeToGold(int id) {
        boolean successful = false;
        Customer a = Archive.getInstance().getCustomer(id);

        if(a.getMyType() == Customer.CustomerType.platinum) {
            a.changeCustomerType(Customer.CustomerType.gold);
            a.getCC().changeCCType(CreditCard.CreditCardType.gold);
            successful = true;
        }

        return successful;

    }
}