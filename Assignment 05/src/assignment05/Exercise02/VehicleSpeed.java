package assignment05.Exercise02;

public interface VehicleSpeed {

    String speed();

    class slowSpeed implements VehicleSpeed{
        public String speed() {
            return "slow speed";
        }
    }
    class normalSpeed implements VehicleSpeed{
        public String speed() {
            return "normal speed";
        }
    }
    class fastSpeed implements VehicleSpeed{
        public String speed() {
            return "fast speed";
        }
    }
}
