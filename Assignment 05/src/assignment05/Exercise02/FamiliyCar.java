package assignment05.Exercise02;

public class FamiliyCar extends Vehicles{

    public FamiliyCar(){
        super();
        carType = new CarType.FamilyCar();
        luggageType = new Luggage.TwoSmallTwoLarge();
        VAtype = new VehicleAccessibility.notPublicAccessible();
        CostType = new VehicleCost.fifteenPerHour();
        ConsumptionType = new VehicleConsumption.gasoline();
        SpeedType = new VehicleSpeed.normalSpeed();
    }


}
