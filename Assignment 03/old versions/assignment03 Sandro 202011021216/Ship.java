package assignment03;

interface Ship {

    Location getFirstLocation();
    Location getSecondLocation();

    boolean isValid();
    String getShipType();
    int getShipLength();
    int getMaxAmount();
    char getShipSymbol();
    boolean checkShipSize(Location a, Location b);

}
