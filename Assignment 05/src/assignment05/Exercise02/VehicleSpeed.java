package assignment05.Exercise02;

/**
 * Here we define the different Vehicle speed
 *
 * @return depends on car type which one we want
 * @version 1.0
 * @since 27.11.2020
 */


public interface VehicleSpeed {

    String speed();

    class slowSpeed implements VehicleSpeed{
        public String speed() {
            return "slow speed; ";
        }
    }
    class normalSpeed implements VehicleSpeed{
        public String speed() {
            return "normal speed; ";
        }
    }
    class fastSpeed implements VehicleSpeed{
        public String speed() {
            return "fast speed; ";
        }
    }
}
