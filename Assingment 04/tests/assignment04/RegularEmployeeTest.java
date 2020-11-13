package TestCases.assignment04;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RegularEmployeeTest {


    RegularEmployee h = new RegularEmployee("Hans","Muster");


    @Test
    void getName() {
        assertEquals("Muster",h.getName());
    }

    @Test
    void getSurname() {
        assertEquals("Hans",h.getSurname());
    }

    @Test
    void getIDNumber() {
        assertEquals(Archive.getInstance().getEmployee(h.getIDNumber()),h);
    }

    @Test
    void upgradeToGold() {
        Customer c = new Customer("Hans","Muster","22/10/97",0, Customer.CustomerType.regular,221);
        assertTrue(h.upgradeToGold(c.getId()));

    }

}