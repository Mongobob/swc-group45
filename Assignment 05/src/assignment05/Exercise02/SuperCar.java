package assignment05.Exercise02;

/**
 * Inherits from vehicle and then the specific types for a supercar
 *
 * @return a Super car with all his details
 * @version 1.0
 * @since 27.11.2020
 */


public class SuperCar extends Vehicles{
    public SuperCar(){
        super();
        carType = new CarType.SuperCar();
        luggageType = new Luggage.OneSmallOneLarge();
        VAtype = new VehicleAccessibility.notPublicAccessible();
        CostType = new VehicleCost.thirtyPerHour();
        ConsumptionType = new VehicleConsumption.gasoline();
        SpeedType = new VehicleSpeed.fastSpeed();
    }

}
