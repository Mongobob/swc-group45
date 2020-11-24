package assignment05.Exercise02;

public interface VehicleAccessibility {

    String accessibility();

    class PublicAccessible implements VehicleAccessibility{

        public String accessibility() {
            return "public";
        }
    }

    class notPublicAccessible implements VehicleAccessibility{

        public String accessibility() {
            return "private";
        }
    }

}
