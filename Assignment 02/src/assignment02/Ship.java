package assignment02;

interface Ship {

    Location getFirstLocation();
    Location getSecondLocation();

    boolean isValid();
    String getShipType();
    int getMaxAmount();
    char getShipSymbol();
    boolean checkShipSize(Location a, Location b);

}
