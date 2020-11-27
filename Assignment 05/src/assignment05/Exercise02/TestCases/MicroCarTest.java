package assignment05.Exercise02.TestCases;

import assignment05.Exercise02.CarType;
import assignment05.Exercise02.Luggage;
import assignment05.Exercise02.VehicleCost;
import assignment05.Exercise02.VehicleSpeed;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * The test is here to check if the functionalities of the
 * code work and if the assumed output is true
 *
 *
 * @version 1.2
 * @since 27.11.2020
 */

class MicroCarTest {

    CarType.MicroCar a = new CarType.MicroCar();
    Luggage.oneBag c = new Luggage.oneBag();
    VehicleCost.twelvePerHour f = new VehicleCost.twelvePerHour();
    VehicleSpeed.normalSpeed g = new VehicleSpeed.normalSpeed();

    @Test
    void carType() {
        assertEquals("Micro Car; ",a.carType());
        try {
            if ("Micro Car; ".equals(a.carType())){
                System.out.println(a.carType());
            }
        }
        catch (NullPointerException e){
            System.out.println("Null pointer Exception");
        }
    }

    @Test
    void getCarType() {
        assertEquals("Micro Car; ",a.carType());
        try {
            if ("Micro Car; ".equals(a.carType())){
                System.out.println(a.carType());
            }
        }
        catch (NullPointerException e){
            System.out.println("Null pointer Exception");
        }
    }

    @Test
    void luggage() {
        assertEquals("1 bag; ",c.amountOfLuggage());
        try {
            if ("1 bag; ".equals(c.amountOfLuggage())){
                System.out.println(c.amountOfLuggage());
            }
        }
        catch (NullPointerException e){
            System.out.println("Null pointer Exception");
        }
    }

    @Test
    void getLuggageType() {
        assertEquals("1 bag; ",c.amountOfLuggage());
        try {
            if ("1 bag; ".equals(c.amountOfLuggage())){
                System.out.println(c.amountOfLuggage());
            }
        }
        catch (NullPointerException e){
            System.out.println("Null pointer Exception");
        }
    }

    @Test
    void speed() {
        assertEquals("normal speed; ",g.speed());
        try {
            if (g.speed().equals("normal speed; ")){
                System.out.println(g.speed());
            }
        }
        catch (NullPointerException e){
            System.out.println("Null pointer Exception");
        }
    }

    @Test
    void getSpeed() {
        assertEquals("normal speed; ",g.speed());
        try {
            if (g.speed().equals("normal speed; ")){
                System.out.println(g.speed());
            }
        }
        catch (NullPointerException e){
            System.out.println("Null pointer Exception");
        }
    }

    @Test
    void cost() {
        assertEquals("12 CHF/h",f.costPerHour());
        try {
            if ("12 CHF/h".equals(f.costPerHour())){
                System.out.println(f.costPerHour());
            }
        }
        catch (NullPointerException e){
            System.out.println("Null pointer Exception");
        }

    }

    @Test
    void getCost() {
        assertEquals("12 CHF/h",f.costPerHour());
        try {
            if ("12 CHF/h".equals(f.costPerHour())){
                System.out.println(f.costPerHour());
            }
        }
        catch (NullPointerException e){
            System.out.println("Null pointer Exception");
        }
    }
}