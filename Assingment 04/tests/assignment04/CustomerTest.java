package assignment04;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;


import java.util.ArrayList;

class CustomerTest {
    /**
     * This Test is for checking the Customer class for working properly and as escpected
     *
     *
     */
    private Cust = new Customer()
    //protected Customer(String name, String surname, String birthDay, float savings,
    //                   CustomerType cType, int pin){

    }
        private static String[] firstNames = {"James", "Sarah", "Jon"};
        private static String[] lastNames = {"Smith", "Greenwood", "Oliver"};
        private static int[] ids = {1, 2, 3};
        private static ArrayList<WebTechnician> staff = new ArrayList<>();

        public static void main(String[] args){

            for (int i = 0; i < firstNames.length; i++) {
                staff.add(new WebTechnician(firstNames[i], lastNames[i], new EmployeeCounter()));
            }


        }

        @Test
        @DisplayName("Basic Functionality Check for Generator and Call Methods")
        void FunctionalityCheck() {
            String[] firstNames = {"James", "Sarah", "Jon"};
            String[] lastNames = {"Smith", "Greenwood", "Oliver"};
            int[] ids = {10000, 10000, 10000};


            for (int i = 0; i < firstNames.length; i++) {
                staff.add(new WebTechnician(firstNames[i], lastNames[i], new EmployeeCounter()));
            }

            for (int i = 0; i < staff.size(); i++) {
                Assertions.assertEquals(firstNames[i], staff.get(i).getName());
                Assertions.assertEquals(lastNames[i], staff.get(i).getSurname());
                Assertions.assertEquals(ids[i], staff.get(i).getIDNumber());
            }

        }

        @Test
        void getSurname() {
        }

        @Test
        void getName() {
        }

        @Test
        void fixWebsite() {
        }

        @Nested
        @DisplayName("TESTS")
        class Blabla {
            private final int x = 2;

            @Test
            @DisplayName("Trial by fire")
            void testertest() {
                Assertions.assertEquals(2, x);
            }
        }

}