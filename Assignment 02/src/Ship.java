public interface Ship {

    static int counter = 0;
    static int AmountOfShip = 0;
    public String getShipType();

    static int getAmountOfShip(){
        return AmountOfShip;
    }
    static int getCounter(){
        return 0;
    }
    char getShipSymbol();
    static boolean checkShipSize(Location a, Location b){
        return false;
    }
    static void reduceNumbersLeft(){}

    public Location getFirstLocation();
    public Location getSecondLocation();


}
