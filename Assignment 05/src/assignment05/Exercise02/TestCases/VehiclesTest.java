package assignment05.Exercise02.TestCases;

import assignment05.Exercise02.*;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

/**
 * The test is here to check if the functionalities of the
 * vehicle class and determine if the assumed output is true
 *
 * Checked functionalities are:
 * - set and change CarType
 * - set and change Accessibility
 * - ... permitted Luggage
 * - ... travel Speed
 * - ... the Cost
 * - ... what kind of energy the car consumes
 *
 *
 * @version 1.5
 * @since 27.11.2020
 * @author Josip Harambasic & Anthony Wernli
 */

class VehiclesTest {

    private Vehicles a;
    private Vehicles b;
    private Vehicles c;
    private Vehicles d;

    // Set up - Called before each method to generate customer
    @BeforeEach
    public void setUp() {
        // initialize various customers
        a = new MicroCar();
        b = new FamilyCar();
        c = new SuperCar();
        d = new Bus();
    }

    // Tear down - Called after every test method.
    @AfterEach
    public void tearDown() {
        // clearing all in case there was something left
        a = null;
        b = null;
        c = null;
        d = null;
    }

    /**
     * Check if we can initiate and change the type of car a vehicle is/has.
     */
    @Test
    @DisplayName("Check if Car Type is correct")
    void CarType() {
        // check initiation
        Assertions.assertAll(() -> assertEquals("Micro Car; ", a.CarType()),
                () -> assertEquals("Family Car; ", b.CarType()),
                () -> assertEquals("Super Car; ", c.CarType()),
                () -> assertEquals("Bus; ", d.CarType()));

        // change the values
        a.getCarType(new CarType.FamilyCar());
        b.getCarType(new CarType.SuperCar());
        c.getCarType(new CarType.Bus());
        d.getCarType(new CarType.MicroCar());

        // check the changes made
        Assertions.assertAll(() -> assertEquals("Family Car; ", a.CarType()),
                () -> assertEquals("Super Car; ", b.CarType()),
                () -> assertEquals("Bus; ", c.CarType()),
                () -> assertEquals("Micro Car; ", d.CarType()));
    }

    /**
     * Check if we can initiate and change the if a vehicle is private or public.
     */
    @Test
    @DisplayName("Check if Accessibility is correct")
    void VehicleAccessibility() {
        // check initiation
        Assertions.assertAll(() -> assertEquals("private ", a.VAtype()),
                () -> assertEquals("private ", b.VAtype()),
                () -> assertEquals("private ", c.VAtype()),
                () -> assertEquals("public ", d.VAtype()));

        // change the values
        a.getVAtype(new VehicleAccessibility.PublicAccessible());
        b.getVAtype(new VehicleAccessibility.PublicAccessible());
        c.getVAtype(new VehicleAccessibility.PublicAccessible());
        d.getVAtype(new VehicleAccessibility.notPublicAccessible());

        // check the changes
        Assertions.assertAll(() -> assertEquals("public ", a.VAtype()),
                () -> assertEquals("public ", b.VAtype()),
                () -> assertEquals("public ", c.VAtype()),
                () -> assertEquals("private ", d.VAtype()));
    }

    /**
     * Check if we can initiate and change the type of luggage a vehicle allows.
     */
    @Test
    @DisplayName("Check if Luggage is correct")
    void Luggage() {
        // check initiation
        Assertions.assertAll(() -> assertEquals("1 bag; ", a.Luggage()),
                () -> assertEquals("2 small and 2 large bags; ", b.Luggage()),
                () -> assertEquals("1 small and 1 large bag; ", c.Luggage()),
                () -> assertEquals("Infinite amount of luggage; ", d.Luggage()));

        // change the values
        a.getLuggageType(new Luggage.TwoSmallTwoLarge());
        b.getLuggageType(new Luggage.OneSmallOneLarge());
        c.getLuggageType(new Luggage.InfiniteAmount());
        d.getLuggageType(new Luggage.oneBag());

        // check the changes
        Assertions.assertAll(() -> assertEquals("2 small and 2 large bags; ", a.Luggage()),
                () -> assertEquals("1 small and 1 large bag; ", b.Luggage()),
                () -> assertEquals("Infinite amount of luggage; ", c.Luggage()),
                () -> assertEquals("1 bag; ", d.Luggage()));
    }

    /**
     * Check if we can initiate and change the speed of vehicle.
     */
    @Test
    @DisplayName("Check if Speed is correct")
    void Speed() {
        // check initiation
        Assertions.assertAll(() -> assertEquals("normal speed; ", a.Speed()),
                () -> assertEquals("normal speed; ", b.Speed()),
                () -> assertEquals("fast speed; ", c.Speed()),
                () -> assertEquals("slow speed; ", d.Speed()));

        // change the values
        a.getSpeed(new VehicleSpeed.fastSpeed());
        b.getSpeed(new VehicleSpeed.slowSpeed());
        c.getSpeed(new VehicleSpeed.normalSpeed());
        d.getSpeed(new VehicleSpeed.fastSpeed());

        // check the changes
        Assertions.assertAll(() -> assertEquals("fast speed; ", a.Speed()),
                () -> assertEquals("slow speed; ", b.Speed()),
                () -> assertEquals("normal speed; ", c.Speed()),
                () -> assertEquals("fast speed; ", d.Speed()));
    }


    /**
     * Check if we can initiate and change the cost of vehicle.
     */
    @Test
    @DisplayName("Check if Cost is correct")
    void Cost() {
        // check initiation
        Assertions.assertAll(() -> assertEquals("12 CHF/h", a.Cost()),
                () -> assertEquals("15 CHF/h", b.Cost()),
                () -> assertEquals("30 CHF/h", c.Cost()),
                () -> assertEquals("5 CHF/h", d.Cost()));

        // change the values
        a.getCost(new VehicleCost.fifteenPerHour());
        b.getCost(new VehicleCost.thirtyPerHour());
        c.getCost(new VehicleCost.fivePerHour());
        d.getCost(new VehicleCost.twelvePerHour());

        // check the changes
        Assertions.assertAll(() -> assertEquals("15 CHF/h", a.Cost()),
                () -> assertEquals("30 CHF/h", b.Cost()),
                () -> assertEquals("5 CHF/h", c.Cost()),
                () -> assertEquals("12 CHF/h", d.Cost()));
    }


    /**
     * Check if we can initiate and change the kind of energy a vehicle uses.
     */
    @Test
    @DisplayName("Check if Consumption is correct")
    void Consumption() {
        // check initiation
        Assertions.assertAll(() -> assertEquals("electric; ", a.Consumption()),
                () -> assertEquals("gasoline; ", b.Consumption()),
                () -> assertEquals("gasoline; ", c.Consumption()),
                () -> assertEquals("diesel; ", d.Consumption()));

        // change the values
        a.getConsumption(new VehicleConsumption.diesel());
        b.getConsumption(new VehicleConsumption.electric());
        c.getConsumption(new VehicleConsumption.diesel());
        d.getConsumption(new VehicleConsumption.gasoline());

        // check the changes
        Assertions.assertAll(() -> assertEquals("diesel; ", a.Consumption()),
                () -> assertEquals("electric; ", b.Consumption()),
                () -> assertEquals("diesel; ", c.Consumption()),
                () -> assertEquals("gasoline; ", d.Consumption()));
    }

}