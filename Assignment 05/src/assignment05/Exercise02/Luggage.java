package assignment05.Exercise02;

/**
 * Here we define the different Vehicle luggagetypes
 *
 * @return depends on car type which one we want
 * @version 1.0
 * @since 27.11.2020
 */


public interface Luggage {
    String amountOfLuggage();

    class oneBag implements Luggage{

        public String amountOfLuggage() {
            return "1 bag; ";
        }
    }

    class TwoSmallTwoLarge implements Luggage{

        public String amountOfLuggage() {
            return "2 small and 2 large bags; ";
        }
    }

    class OneSmallOneLarge implements Luggage{

        public String amountOfLuggage() {
            return "1 small and 1 large bag; ";
        }
    }

    class InfiniteAmount implements Luggage{

        public String amountOfLuggage() {
            return "Infinite amount of luggage; ";
        }
    }
}
