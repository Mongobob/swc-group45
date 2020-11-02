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
    int getHits(); //I want to try if len Ship == hits then show the hole shipSybole
    void setShipSymbol(char c); //to change the Shipsymbol into X or O if we hit or not

}
