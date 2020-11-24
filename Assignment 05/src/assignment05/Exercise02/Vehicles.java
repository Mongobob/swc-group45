package assignment05.Exercise02;

public interface Vehicles {

    String carType();
    String accessibility();
    String luggage();
    String speed();
    String cost();
    String consumptionType();



    /** we need
     * Micro car / private car / 1 bag / normal speed / 12CHF/h / electric car
     * Family car / private car / 2 small bags and 2 large bags / normal speed / 15CHF/h / gasoline
     * Supercar / private car / 1 small bag and 1 large bag / fast speed / 30CHF/h / gasoline
     * Bus / public car / infinite amount of luggage / slow speed / 5CHF/h
     */

}

class CarType implements Vehicles{

}
