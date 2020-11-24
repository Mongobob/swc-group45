package assignment05.Exercise02;

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
