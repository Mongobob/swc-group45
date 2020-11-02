package assignment03;

import java.util.Observable;

public interface Ship {

    Location getFirstLocation();
    Location getSecondLocation();

    boolean isValid();
    String getShipType();
    int getShipLength();
    int getMaxAmount();
    char getShipSymbol();
    char getShipSymbolAt(int i); // new method returns value at set index i
    boolean checkShipSize(Location a, Location b);
    void setShipSymbol(char c); //to change the Shipsymbol into X or O if we hit or not

}
