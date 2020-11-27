package assignment05.Exercise02.TestCases;

import assignment05.Exercise02.CarType;
import assignment05.Exercise02.Luggage;
import assignment05.Exercise02.VehicleCost;
import assignment05.Exercise02.VehicleSpeed;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SuperCarTest {

    CarType.SuperCar a = new CarType.SuperCar();
    Luggage.OneSmallOneLarge c = new Luggage.OneSmallOneLarge();
    VehicleCost.thirtyPerHour f = new VehicleCost.thirtyPerHour();
    VehicleSpeed.fastSpeed g = new VehicleSpeed.fastSpeed();


    @Test
    void carType() {
        assertEquals("Super Car; ", a.carType());
    }

    @Test
    void getCarType() {
        assertEquals("Super Car; ", a.carType());
    }

    @Test
    void luggage() {
        assertEquals("1 small and 1 large bag; ",c.amountOfLuggage());
    }

    @Test
    void getLuggageType() {
        assertEquals("1 small and 1 large bag; ",c.amountOfLuggage());
    }

    @Test
    void speed() {
        assertEquals("fast speed; ",g.speed());
    }

    @Test
    void getSpeed() {
        assertEquals("fast speed; ",g.speed());
    }

    @Test
    void cost() {
        assertEquals("30CHF/h",f.costPerHour());
    }

    @Test
    void getCost() {
        assertEquals("30CHF/h",f.costPerHour());
    }
}