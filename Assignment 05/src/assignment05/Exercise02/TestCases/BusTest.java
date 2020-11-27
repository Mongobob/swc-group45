package assignment05.Exercise02.TestCases;

import assignment05.Exercise02.CarType;
import assignment05.Exercise02.Luggage;
import assignment05.Exercise02.VehicleCost;
import assignment05.Exercise02.VehicleSpeed;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BusTest {


    CarType.Bus a = new CarType.Bus();
    Luggage.InfiniteAmount c = new Luggage.InfiniteAmount();
    VehicleCost.fivePerHour f = new VehicleCost.fivePerHour();
    VehicleSpeed.slowSpeed g = new VehicleSpeed.slowSpeed();

    @Test
    void carType() {
        assertEquals("Bus; ",a.carType());
    }


    @Test
    void getCarType() {
        assertEquals("Bus; ",a.carType());
    }

    @Test
    void luggage() {
        assertEquals("Infinite amount of luggage; ",c.amountOfLuggage());
    }

    @Test
    void getLuggageType() {
        assertEquals("Infinite amount of luggage; ",c.amountOfLuggage());
    }

    @Test
    void speed() {
        assertEquals("slow speed; ",g.speed());
    }

    @Test
    void getSpeed() {
        assertEquals("slow speed; ",g.speed());
    }

    @Test
    void cost() {
        assertEquals("5CHF/h",f.costPerHour());

    }

    @Test
    void getCost() {
        assertEquals("5CHF/h",f.costPerHour());
    }
}