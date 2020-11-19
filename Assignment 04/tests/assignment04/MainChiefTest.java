package assignment04;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @return we try to check if the up and downgrades work
 * @args we take the customers id to change their status
 */

class MainChiefTest {

    MainChief j = new MainChief("Hans","Muster");

    @Test
    void getName(){
        assertEquals("Hans",j.getName());

    }

    @Test
    void getSurname(){
        assertEquals("Muster",j.getSurname());
    }

    @Test
    void getIDNumber(){
        assertEquals(Archive.getInstance().getEmployee(j.getIDNumber()),j);
    }

    @Test
    void upgradeToPlatinum() {
        Customer c = new Customer("Hans","Muster","22/10/97",0, Customer.CustomerType.regular,"221");
        assertTrue(j.upgradeToPlatinum(c.getId()));
    }

    @Test
    void downgradeToRegular() {
        Customer c = new Customer("Hans","Muster","22/10/97",0, Customer.CustomerType.regular,"221");
        assertTrue(j.downgradeToRegular(c.getId()));
    }

    @Test
    void downgradeToGold() {
        Customer c = new Customer("Hans","Muster","22/10/97",0, Customer.CustomerType.regular,"221");
        assertTrue(j.downgradeToGold(c.getId()));
    }
}