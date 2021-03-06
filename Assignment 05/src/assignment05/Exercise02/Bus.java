package assignment05.Exercise02;

/**
 * Inherits from vehicle and then the specific types for a supercar
 *
 * @return a Bus with all his details
 * @version 1.0
 * @since 27.11.2020
 */

public class Bus extends Vehicles {
    /**
     * we inherit here from Vehicles
     */
    public Bus(){
        super();
        carType = new CarType.Bus();
        luggageType = new Luggage.InfiniteAmount();
        VAtype = new VehicleAccessibility.PublicAccessible();
        CostType = new VehicleCost.fivePerHour();
        ConsumptionType = new VehicleConsumption.diesel();
        SpeedType = new VehicleSpeed.slowSpeed();
    }

}
