package assignment04;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CustomerTest {

    private Customer d;
    private Customer e;
    private Customer f;

    // Set up - Called before each method to generate customer
    @BeforeEach
    public void setUp() {
        // clearing all in case there was something left
        Archive.getInstance().reset();
        CustomerCounter.getInstance().resetID();
        EmployeeCounter.getInstance().resetID();

        // add one employee to handle all the customers
        RegularEmployee a = new RegularEmployee("Jon", "Smith");

        // initialize various customers
        d = new Customer("Gloria", "Gloris", "01/01/2020", 1200000, Customer.CustomerType.platinum, "777");
        e = new Customer("Stephen", "Colbert", "13/06/1976", 400000, Customer.CustomerType.regular, "467");
        f = new Customer("Ru", "Paul", "12/05/1986", 2800000, Customer.CustomerType.gold, "867");
    }

    // Tear down - Called after every test method.
    @AfterEach
    public void tearDown() {
        // clearing all in case there was something left
        Archive.getInstance().reset();
        CustomerCounter.getInstance().resetID();
        EmployeeCounter.getInstance().resetID();
    }

    @Test
    void getName() {
        Assertions.assertEquals("Gloria", d.getName());
        Assertions.assertEquals("Stephen", e.getName());
        Assertions.assertEquals("Ru", f.getName());
    }

    @Test
    void getSurname() {
        Assertions.assertEquals("Gloris", d.getSurname());
        Assertions.assertEquals("Colbert", e.getSurname());
        Assertions.assertEquals("Paul", f.getSurname());
    }

    @Test
    void function1() {
        d.deposit(20);
        Assertions.assertEquals(1200020, d.getSavings());
        e.deposit(100);
        Assertions.assertEquals(400100, e.getSavings());
    }

    @Test
    void function2() {
        float x = d.withdraw(20);
        Assertions.assertEquals(20, x);
        float y = d.withdraw(2000000000);
        Assertions.assertEquals(0, y);
    }



}