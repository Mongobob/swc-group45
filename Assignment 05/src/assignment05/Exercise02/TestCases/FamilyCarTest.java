package assignment05.Exercise02.TestCases;

import assignment05.Exercise02.CarType;
import assignment05.Exercise02.Luggage;
import assignment05.Exercise02.VehicleCost;
import assignment05.Exercise02.VehicleSpeed;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FamilyCarTest {
    CarType.FamilyCar a = new CarType.FamilyCar();
    Luggage.TwoSmallTwoLarge c = new Luggage.TwoSmallTwoLarge();
    VehicleCost.fifteenPerHour f = new VehicleCost.fifteenPerHour();
    VehicleSpeed.normalSpeed g = new VehicleSpeed.normalSpeed();

    @Test
    void carType() {
        assertEquals("Family Car; ",a.carType());
    }

    @Test
    void getCarType() {
        assertEquals("Family Car; ",a.carType());
    }

    @Test
    void luggage() {
        assertEquals("2 small and 2 large bags; ",c.amountOfLuggage());
    }

    @Test
    void getLuggageType() {
        assertEquals("2 small and 2 large bags; ",c.amountOfLuggage());
    }

    @Test
    void speed() {
        assertEquals("normal speed; ", g.speed());
    }

    @Test
    void getSpeed() {
        assertEquals("normal speed; ", g.speed());
    }

    @Test
    void cost() {
        assertEquals("15CHF/h",f.costPerHour());
    }

    @Test
    void getCost() {
        assertEquals("15CHF/h",f.costPerHour());
    }
}