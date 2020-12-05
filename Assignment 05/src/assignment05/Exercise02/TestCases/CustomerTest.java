package assignment05.Exercise02.TestCases;

import assignment05.Exercise02.*;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

/**
 * The test is here to check if the functionalities of the
 * code work and if the assumed output is true
 *
 * Checked functionalities are the kind of vehicle a costumer
 * can choose and the date at which they would like to use it.
 *
 * @version 1.5
 * @since 27.11.2020
 * @author Josip Harambasic & Anthony Wernli
 */

class CustomerTest {

    private Customer a;
    private Customer b;
    private Customer c;
    private Customer d;

    // Set up - Called before each method to generate customer
    @BeforeEach
    public void setUp() {
        Vehicles microCar = new MicroCar();
        Vehicles familyCar = new FamilyCar();
        Vehicles superCar = new SuperCar();
        Vehicles bus = new Bus();
        // initialize various customers
        a = new Customer( microCar, "10/12/2020");
        b = new Customer( familyCar, "11/12/2020");
        c = new Customer( superCar, "12/12/2020");
        d = new Customer( bus, "13/12/2020");
    }

    // Tear down - Called after every test method.
    @AfterEach
    public void tearDown() {
        // clearing all in case there was something left
        a = null;
        b = null;
        c = null;
        d = null;
    }


    @Test
    @DisplayName("Check if Customer Vehicle Preferences are met")
    void ride() {
        Assertions.assertAll(() -> assertEquals("Micro Car; 1 bag; normal speed; 12 CHF/h", a.ride()),
                () -> assertEquals("Family Car; 2 small and 2 large bags; normal speed; 15 CHF/h", b.ride()),
                () -> assertEquals("Super Car; 1 small and 1 large bag; fast speed; 30 CHF/h", c.ride()),
                () -> assertEquals("Bus; Infinite amount of luggage; slow speed; 5 CHF/h", d.ride()));
    }

    @Test
    @DisplayName("Check if Customer Date Preferences are met")
    void getDepartureDay() {
        Assertions.assertAll(() -> assertEquals("10/12/2020", a.getDepartureDay()),
                () -> assertEquals("11/12/2020", b.getDepartureDay()),
                () -> assertEquals("12/12/2020", c.getDepartureDay()),
                () -> assertEquals("13/12/2020", d.getDepartureDay()));
    }

}