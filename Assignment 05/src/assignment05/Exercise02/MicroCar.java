package assignment05.Exercise02;

/**
 * Inherits from vehicle and then the specific types for a supercar
 *
 * @return a Micro car with all his details
 * @version 1.0
 * @since 27.11.2020
 */

public class MicroCar extends Vehicles {


    public MicroCar(){
        super();
        carType = new CarType.MicroCar();
        luggageType = new Luggage.oneBag();
        VAtype = new VehicleAccessibility.notPublicAccessible();
        CostType = new VehicleCost.twelvePerHour();
        ConsumptionType = new VehicleConsumption.electric();
        SpeedType = new VehicleSpeed.normalSpeed();
    }

}
