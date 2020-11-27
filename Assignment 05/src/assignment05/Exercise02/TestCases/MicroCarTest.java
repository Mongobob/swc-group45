package assignment05.Exercise02.TestCases;

import assignment05.Exercise02.CarType;
import assignment05.Exercise02.Luggage;
import assignment05.Exercise02.VehicleCost;
import assignment05.Exercise02.VehicleSpeed;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MicroCarTest {

    CarType.MicroCar a = new CarType.MicroCar();
    Luggage.oneBag c = new Luggage.oneBag();
    VehicleCost.twelvePerHour f = new VehicleCost.twelvePerHour();
    VehicleSpeed.normalSpeed g = new VehicleSpeed.normalSpeed();

    @Test
    void carType() {
        assertEquals("Micro Car; ", a.carType());
    }

    @Test
    void getCarType() {
        assertEquals("Micro Car; ", a.carType());
    }

    @Test
    void luggage() {
        assertEquals("1 bag; ", c.amountOfLuggage());
    }

    @Test
    void getLuggageType() {
        assertEquals("1 bag; ", c.amountOfLuggage());
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
        assertEquals("12CHF/h", f.costPerHour());
    }

    @Test
    void getCost() {
        assertEquals("12CHF/h", f.costPerHour());
    }
}