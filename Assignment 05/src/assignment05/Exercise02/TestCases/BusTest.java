package assignment05.Exercise02.TestCases;

import assignment05.Exercise02.CarType;
import assignment05.Exercise02.Luggage;
import assignment05.Exercise02.VehicleCost;
import assignment05.Exercise02.VehicleSpeed;
import org.testng.annotations.Test;

import javax.lang.model.type.NullType;

import static org.junit.jupiter.api.Assertions.*;

/**
 * The test is here to check if the functionalities of the
 * code work and if the assumed output is true
 *
 *
 * @version 1.2
 * @since 27.11.2020
 */

class BusTest {


    CarType.Bus a = new CarType.Bus();
    Luggage.InfiniteAmount c = new Luggage.InfiniteAmount();
    VehicleCost.fivePerHour f = new VehicleCost.fivePerHour();
    VehicleSpeed.slowSpeed g = new VehicleSpeed.slowSpeed();



    @Test
    void carType() {
        assertEquals("Bus; ",a.carType());
        try {
            if ("Bus; ".equals(a.carType())){
                System.out.println(a.carType());
            }
        }
        catch (NullPointerException e){
            System.out.println("Null pointer Exception");
        }
    }

    @Test
    void getCarType() {
        assertEquals("Bus; ",a.carType());
        try {
            if ("Bus; ".equals(a.carType())){
                System.out.println(a.carType());
            }
        }
        catch (NullPointerException e){
            System.out.println("Null pointer Exception");
        }
    }

    @Test
    void luggage() {
        assertEquals("Infinite amount of luggage; ",c.amountOfLuggage());
        try {
            if ("Infinite amount of luggage; ".equals(c.amountOfLuggage())){
                System.out.println(c.amountOfLuggage());
            }
        }
        catch (NullPointerException e){
            System.out.println("Null pointer Exception");
        }
    }

    @Test
    void getLuggageType() {
        assertEquals("Infinite amount of luggage; ",c.amountOfLuggage());
        try {
            if ("Infinite amount of luggage; ".equals(c.amountOfLuggage())){
                System.out.println(c.amountOfLuggage());
            }
        }
        catch (NullPointerException e){
            System.out.println("Null pointer Exception");
        }
    }

    @Test
    void speed() {
        assertEquals("slow speed; ",g.speed());
        try {
            if (g.speed().equals("slow speed; ")){
                System.out.println(g.speed());
            }
        }
        catch (NullPointerException e){
            System.out.println("Null pointer Exception");
        }
    }

    @Test
    void getSpeed() {
        assertEquals("slow speed; ",g.speed());
        try {
            if (g.speed().equals("slow speed; ")){
                System.out.println(g.speed());
            }
        }
        catch (NullPointerException e){
            System.out.println("Null pointer Exception");
        }
    }

    @Test
    void cost() {
        assertEquals("5CHF/h",f.costPerHour());
        try {
            if ("5CHF/h".equals(f.costPerHour())){
                System.out.println(f.costPerHour());
            }
        }
        catch (NullPointerException e){
            System.out.println("Null pointer Exception");
        }

    }

    @Test
    void getCost() {
        assertEquals("5CHF/h",f.costPerHour());
        try {
            if ("5CHF/h".equals(f.costPerHour())){
                System.out.println(f.costPerHour());
            }
        }
        catch (NullPointerException e){
            System.out.println("Null pointer Exception");
        }
    }
}