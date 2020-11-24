package assignment05.Exercise02;

public class Vehicles{

    /**
     * Car type
     */

    public CarType carType;

    public String CarType(){return carType.carType();}
    public void getCarType(CarType newCar){carType = newCar;}


    /**
     * Vehicle accessibility private or public
     */
    public VehicleAccessibility VAtype;

    public String VAtype(){
        return VAtype.accessibility();
    }
    public void getVAtype(VehicleAccessibility newVAtype){
        VAtype = newVAtype;
    }


    /**
     * Amount of the luggage
     */
    public Luggage luggageType;

    public String Luggage(){
        return luggageType.amountOfLuggage();
    }

    public void getLuggageType(Luggage newLuggageType){
        luggageType = newLuggageType;
    }

    /**
     * Vehicle speed
     */

    public VehicleSpeed SpeedType;

    public String Speed(){
        return SpeedType.speed();
    }
    public void getSpeed(VehicleSpeed newSpeedtype){
        SpeedType = newSpeedtype;
    }

    /**
     * Vehicle cost
     */

    public VehicleCost CostType;

    public String Cost(){
        return CostType.costPerHour();
    }

    public void getCost(VehicleCost newCostype){
        CostType = newCostype;
    }

    /**
     * Vehicle consumption
     */

    public VehicleConsumption ConsumptionType;

    public String Consumption(){
        return ConsumptionType.consumption();
    }

    public void getConsumption(VehicleConsumption newConsumptiontype){
        ConsumptionType = newConsumptiontype;
    }

}
