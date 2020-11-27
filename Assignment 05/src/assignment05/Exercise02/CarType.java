package assignment05.Exercise02;

public interface CarType {

    /**
     * Here we define the different Vehicle names
     *
     * @return depends on car type which one we want
     * @version 1.0
     * @since 27.11.2020
     */
    String carType();

    class MicroCar implements CarType{

        public String carType() {
            return "Micro Car; ";
        }
    }

    class Bus implements CarType{

        public String carType() {
            return "Bus; ";
        }
    }
    class SuperCar implements CarType{

        public String carType() {
            return "Super Car; ";
        }
    }
    class FamilyCar implements CarType{

        public String carType() {
            return "Family Car; ";
        }
    }
}
