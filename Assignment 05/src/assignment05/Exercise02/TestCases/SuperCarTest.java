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

class SuperCarTest {

    CarType.SuperCar a = new CarType.SuperCar();
    Luggage.OneSmallOneLarge c = new Luggage.OneSmallOneLarge();
    VehicleCost.thirtyPerHour f = new VehicleCost.thirtyPerHour();
    VehicleSpeed.fastSpeed g = new VehicleSpeed.fastSpeed();



    @Test
    void carType() {
        assertEquals("Super Car; ",a.carType());
        try {
            if ("Super Car; ".equals(a.carType())){
                System.out.println(a.carType());
            }
        }
        catch (NullPointerException e){
            System.out.println("Null pointer Exception");
        }
    }

    @Test
    void getCarType() {
        assertEquals("Super Car; ",a.carType());
        try {
            if ("Super Car; ".equals(a.carType())){
                System.out.println(a.carType());
            }
        }
        catch (NullPointerException e){
            System.out.println("Null pointer Exception");
        }
    }

    @Test
    void luggage() {
        assertEquals("1 small and 1 large bag; ",c.amountOfLuggage());
        try {
            if ("1 small and 1 large bag; ".equals(c.amountOfLuggage())){
                System.out.println(c.amountOfLuggage());
            }
        }
        catch (NullPointerException e){
            System.out.println("Null pointer Exception");
        }
    }

    @Test
    void getLuggageType() {
        assertEquals("1 small and 1 large bag; ",c.amountOfLuggage());
        try {
            if ("1 small 1 large bag; ".equals(c.amountOfLuggage())){
                System.out.println(c.amountOfLuggage());
            }
        }
        catch (NullPointerException e){
            System.out.println("Null pointer Exception");
        }
    }

    @Test
    void speed() {
        assertEquals("fast speed; ",g.speed());
        try {
            if (g.speed().equals("fast speed; ")){
                System.out.println(g.speed());
            }
        }
        catch (NullPointerException e){
            System.out.println("Null pointer Exception");
        }
    }

    @Test
    void getSpeed() {
        assertEquals("fast speed; ",g.speed());
        try {
            if (g.speed().equals("fast speed; ")){
                System.out.println(g.speed());
            }
        }
        catch (NullPointerException e){
            System.out.println("Null pointer Exception");
        }
    }

    @Test
    void cost() {
        assertEquals("30CHF/h",f.costPerHour());
        try {
            if ("30CHF/h".equals(f.costPerHour())){
                System.out.println(f.costPerHour());
            }
        }
        catch (NullPointerException e){
            System.out.println("Null pointer Exception");
        }

    }

    @Test
    void getCost() {
        assertEquals("30CHF/h",f.costPerHour());
        try {
            if ("30CHF/h".equals(f.costPerHour())){
                System.out.println(f.costPerHour());
            }
        }
        catch (NullPointerException e){
            System.out.println("Null pointer Exception");
        }
    }
}