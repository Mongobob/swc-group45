package assignment05.Exercise02;


/**
 * Here we define the different Vehicle cost
 *
 * @return depends on car type which one we want
 * @version 1.0
 * @since 27.11.2020
 */

public interface VehicleCost {

    String costPerHour();

    class fifteenPerHour implements VehicleCost{

        public String costPerHour() {
            return "15 CHF/h";
        }
    }
    class twelvePerHour implements VehicleCost{

        public String costPerHour() {
            return "12 CHF/h";
        }
    }
    class fivePerHour implements VehicleCost{

        public String costPerHour() {
            return "5 CHF/h";
        }
    }
    class thirtyPerHour implements VehicleCost{

        public String costPerHour() {
            return "30 CHF/h";
        }
    }
}
