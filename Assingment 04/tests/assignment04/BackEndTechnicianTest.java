package assignment04;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @return the name surname and IDNumber
 * @args are the names
 * we test all the inputs and the methods
 */

class BackEndTechnicianTest {
    private static String[] firstNames = {"James", "Sarah", "Jon"};
    private static String[] lastNames = {"Smith", "Greenwood", "Oliver"};
    private static int[] ids = {1, 2, 3};
    private static ArrayList<BackEndTechnician> staff = new ArrayList<>();

    public static void main(String[] args){

        for (int i = 0; i < firstNames.length; i++) {
            staff.add(new BackEndTechnician(firstNames[i], lastNames[i], new EmployeeCounter()));
        }


    }

    @Test
    @DisplayName("Basic Functionality Check for Generator and Call Methods")
    void FunctionalityCheck() {
        String[] firstNames = {"James", "Sarah", "Jon"};
        String[] lastNames = {"Smith", "Greenwood", "Oliver"};
        int[] ids = {10000, 10000, 10000};


        for (int i = 0; i < firstNames.length; i++) {
            staff.add(new BackEndTechnician(firstNames[i], lastNames[i], new EmployeeCounter()));
        }

        for (int i = 0; i < staff.size(); i++) {
            Assertions.assertEquals(firstNames[i], staff.get(i).getName());
            Assertions.assertEquals(lastNames[i], staff.get(i).getSurname());
            Assertions.assertEquals(ids[i], staff.get(i).getIDNumber());
        }

    }

    BackEndTechnician h = new BackEndTechnician("Hans","Muster", EmployeeCounter.getInstance());



    @Test
    void getSurname() {
        assertEquals("Muster",h.getSurname());
    }

    @Test
    void getName() {
        assertEquals("Hans",h.getName());
    }

    @Test
    void fixBackEnd() {
        assertEquals("fixed", h.fixBackEnd(h.getIDNumber()));
    }

    @Test
    void getIDNumber(){
        assertEquals(EmployeeCounter.getInstance().getEmployeeID(),h.getIDNumber());
    }


}