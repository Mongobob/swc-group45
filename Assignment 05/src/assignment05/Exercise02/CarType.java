package assignment05.Exercise02;

public interface CarType {

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
