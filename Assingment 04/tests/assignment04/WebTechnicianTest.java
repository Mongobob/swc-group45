package assignment04;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class WebTechnicianTest {

    @Test
    @DisplayName("Basic Functionality Check for Generator and Call Methods")
    void FunctionalityCheck() {
        String[] firstNames = {"James", "Sarah", "Jon"};
        String[] lastNames = {"Smith", "Greenwood", "Oliver"};
        int[] ids = {1, 2, 3};
        List<WebTechnician> staff = new ArrayList<>();

        for (int i = 0; i < firstNames.length; i++) {
            staff.add(new WebTechnician(firstNames[i], lastNames[i], ids[i]));
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
}