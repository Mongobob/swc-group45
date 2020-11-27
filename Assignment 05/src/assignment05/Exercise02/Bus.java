package assignment05.Exercise02;

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
