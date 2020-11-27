package assignment05.Exercise02;

/**
 * Inherits from vehicle and then the specific types for a supercar
 *
 * @return a Family car with all his details
 * @version 1.0
 * @since 27.11.2020
 */

public class FamilyCar extends Vehicles{

    public FamilyCar(){
        super();
        carType = new CarType.FamilyCar();
        luggageType = new Luggage.TwoSmallTwoLarge();
        VAtype = new VehicleAccessibility.notPublicAccessible();
        CostType = new VehicleCost.fifteenPerHour();
        ConsumptionType = new VehicleConsumption.gasoline();
        SpeedType = new VehicleSpeed.normalSpeed();
    }


}
