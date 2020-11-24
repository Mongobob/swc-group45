package assignment05.Exercise02;

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
