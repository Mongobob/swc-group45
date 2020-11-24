package assignment04;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

class CustomerCounterTest {

    /**
     * Test of uniqueness of the CustomerCounter
     */
    @Test
    @DisplayName("Test for uniqueness")
    void getInstanceTest() {
        // making sure we always get the same Counter
        Assertions.assertEquals(CustomerCounter.getInstance(), CustomerCounter.getInstance());

        // ... even after we used it and made nonsense with it
        CustomerCounter.getInstance().getCustomerID();
        CustomerCounter.getInstance().resetID();
        CustomerCounter.getInstance().getCustomerID();

        Assertions.assertEquals(CustomerCounter.getInstance(), CustomerCounter.getInstance());
    }

    /**
     * Test of ascending values of id's from getCustomerID
     */
    @Test
    @DisplayName("Test for returned id values")
    void getIdValuesTest() {

        // check if the CustomerCounter accurately returns the first one hundred ascending id's
        for(int i = 0; i < 100; i++){
            Assertions.assertEquals(i, CustomerCounter.getInstance().getCustomerID());
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
            CustomerCounter.getInstance().getCustomerID();
        }

        CustomerCounter.getInstance().resetID();

        // after a reset the counter should start at zero again
        Assertions.assertEquals(0, CustomerCounter.getInstance().getCustomerID());

    }

}