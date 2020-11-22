package assignment04;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

class EmployeeCounterTest {

    /**
     * Test of uniqueness of the EmployeeCounter
     */
    @Test
    @DisplayName("Test for uniqueness")
    void getInstanceTest() {
        // making sure we always get the same Counter
        Assertions.assertEquals(EmployeeCounter.getInstance(), EmployeeCounter.getInstance());

        // ... even after we used it and made nonsense with it
        EmployeeCounter.getInstance().getEmployeeID();
        EmployeeCounter.getInstance().resetID();
        EmployeeCounter.getInstance().getEmployeeID();

        Assertions.assertEquals(EmployeeCounter.getInstance(), EmployeeCounter.getInstance());
    }

    /**
     * Test of ascending values of id's from getCustomerID
     */
    @Test
    @DisplayName("Test for returned id values")
    void getIdValuesTest() {

        // check if the EmployeeCounter accurately returns the first one hundred ascending id's
        for(int i = 0; i < 100; i++){
            Assertions.assertEquals(i, EmployeeCounter.getInstance().getEmployeeID());
        }

    }

    /**
     * Test of reset method values for id's from getCustomerID
     */
    @Test
    @DisplayName("Test for reset ability of this class")
    void resetTest() {

        // add ten new id's and then reset to see if they are still there
        for(int i = 0; i < 10; i++){
            EmployeeCounter.getInstance().getEmployeeID();
        }

        EmployeeCounter.getInstance().resetID();

        // after a reset the counter should start at zero again
        Assertions.assertEquals(0, EmployeeCounter.getInstance().getEmployeeID());

    }
}