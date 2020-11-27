package assignment05.Exercise02;

/**
 * Here we define the different Vehicle consumption
 *
 * @return depends on car type which one we want
 * @version 1.0
 * @since 27.11.2020
 */


public interface VehicleConsumption {

    String consumption();

    class electric implements VehicleConsumption{

        public String consumption() {
            return "electric; ";
        }
    }
    class gasoline implements VehicleConsumption {

        public String consumption() {
            return "gasoline; ";
        }
    }
    class diesel implements VehicleConsumption {

        public String consumption() {
            return "diesel; ";
        }
    }
}
