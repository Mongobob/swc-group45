package assignment04;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

class ArchiveTest {

    /**
     * All in one testing. The Archive Class is intertwined with almost all the other classes there for
     * it takes a certain amount of set up to do anything. We are testing:
     *
     * - on construction do customers get saved in the archive
     * - same for employees
     * - do the total numbers match
     * - can we find the customers and the employees with just their id
     * - can we reset the archive deleting everything for a fresh start
     */
    @Test
    @DisplayName("Big all in one test")
    void FunctionalityCheck() {

        // making sure we always get the same archive
        Assertions.assertEquals(Archive.getInstance(), Archive.getInstance());

        // adding and then removing employees to check if the reset method works

        // ... just by creating employees the archive should have stored them already
        Archive.getInstance();
        RegularEmployee a = new RegularEmployee("Jon", "Smith");
        SectionChief b = new SectionChief("Hannah", "Stonewall", "New York");
        MainChief c = new MainChief("Glados", "That Boss Bitch");

        // ... check if they are stored
        Assertions.assertEquals(3, Archive.getInstance().amountEmployee());

        Assertions.assertEquals(a, Archive.getInstance().getEmployee(a.getIDNumber()));
        Assertions.assertEquals(b, Archive.getInstance().getEmployee(b.getIDNumber()));
        Assertions.assertEquals(c, Archive.getInstance().getEmployee(c.getIDNumber()));

        // adding and then removing customers to check if the reset method works

        // ... just by creating employees the archive should have stored them already
        Archive.getInstance();
        Customer d = new Customer("Gloria", "Gloris", "01/01/2020", 1200000, Customer.CustomerType.platinum, "777");
        Customer e = new Customer("Stephen", "Colbert", "13/06/1976", 400000, Customer.CustomerType.regular, "467");
        Customer f = new Customer("Ru", "Paul", "12/05/1986", 2800000, Customer.CustomerType.gold, "867");

        // ... check if they are stored
        Assertions.assertEquals(3, Archive.getInstance().amountCustomer());

        Assertions.assertEquals(d, Archive.getInstance().getCustomer(d.getId()));
        Assertions.assertEquals(e, Archive.getInstance().getCustomer(e.getId()));
        Assertions.assertEquals(f, Archive.getInstance().getCustomer(f.getId()));

        // ... and now check that everything was deleted
        Archive.getInstance().reset();

        Assertions.assertEquals(0, Archive.getInstance().amountEmployee());

    }

}