package assignment05.Exercise02;

/**
 * Here we define the different Vehicle accessibility
 *
 * @return depends on car type which one we want
 * @version 1.0
 * @since 27.11.2020
 */

public interface VehicleAccessibility {

    String accessibility();

    class PublicAccessible implements VehicleAccessibility{

        public String accessibility() {
            return "public ";
        }
    }

    class notPublicAccessible implements VehicleAccessibility{

        public String accessibility() {
            return "private ";
        }
    }

}
