package assignment05.Exercise02;

public interface VehicleConsumption {

    String consumption();

    class electric implements VehicleConsumption{

        public String consumption() {
            return "electric";
        }
    }
    class gasoline implements VehicleConsumption {

        public String consumption() {
            return "gasoline";
        }
    }
    class diesel implements VehicleConsumption {

        public String consumption() {
            return "diesel";
        }
    }
}
