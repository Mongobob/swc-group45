package assignment05.Exercise02;

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
