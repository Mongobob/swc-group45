package assignment05.Exercise02;

public interface VehicleCost {

    String costPerHour();

    class fifteenPerHour implements VehicleCost{

        public String costPerHour() {
            return "15CHF/h";
        }
    }
    class twelvePerHour implements VehicleCost{

        public String costPerHour() {
            return "12CHF/h";
        }
    }
    class fivePerHour implements VehicleCost{

        public String costPerHour() {
            return "5CHF/h";
        }
    }
    class thirtyPerHour implements VehicleCost{

        public String costPerHour() {
            return "30CHF/h";
        }
    }
}
