package assignment05.Exercise02;

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
