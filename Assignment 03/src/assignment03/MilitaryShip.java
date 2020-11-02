package assignment03;

import java.util.ArrayList;
import java.util.Arrays;

public class MilitaryShip implements Ship, MyObservable, Target {

    private char shipSymbol;
    private final int shipLength;
    private final int maxAmountOfThisType;
    private boolean isValid;
    private char[] shipSymbolAt;

    private String shipType;
    private ArrayList<MyObserver> myObservers = new ArrayList<MyObserver>(); // new

    private Location a;
    private Location b;

    protected MilitaryShip(char c, int sL, int maxAmount, Location a, Location b, String shipType){
        this.shipSymbol = c;
        this.shipLength = sL;
        this.maxAmountOfThisType = maxAmount;
        this.a = a;
        this.b = b;
        this.shipType = shipType;
        this.isValid = checkShipSize(a, b);

        this.shipSymbolAt = new char[shipLength]; // added this in order to have a ShipSymbolValue for each square
        Arrays.fill(shipSymbolAt, shipSymbol);
    }

    /**
     * (New) This method adds a new Observer Object to my List of Objects,
     * who need to be informed with update if I change something
     * within this object.
     */
    public void registerObserver(MyObserver newObserver){
        myObservers.add(newObserver);
    }

    /**
     * (New) This method removes an Observer Object from my List of Observers.
     */
    public void removeObserver(MyObserver knownObserver){
        myObservers.remove(knownObserver);
    }

    /**
     * (New) This method tells the boards when a ship was hit
     * and it's symbol on the board needs to be updated. The
     * Index Variable only indicates where the change happened.
     */
    public void notifyObserver(Location a, int index, boolean wasDestroyed){
        for(int i = 0; i < myObservers.size(); i++){
            myObservers.get(i).update(this, a, index, wasDestroyed);
        }
    }

    /**
     * (New) This method allows to access the array if you know
     * the index you're looking for.
     */
    public char getShipSymbolAt(int index){

        char value = ' ';

        if(index <= shipSymbolAt.length){
            value = shipSymbolAt[index];
        }

        return value;
    }

    /**
     * (New) This method allows to hit certain parts of the ship
     * and register the change within the array of the ship.
     */
    public void hit(Location c){
        int minRow, minCol, index;

        // Setup which coordinates need to be checked
        if (a.width == b.width) {
            minRow = Math.min(a.height, b.height);
            index = Math.abs(c.height - minRow);
        } else {
            minCol = Math.min(a.width, b.width);
            index = Math.abs(c.width - minCol);
        }

        shipSymbolAt[index] = 'X';

        // Check if destroyed
        boolean wasDestroyed = true;

        for(int i = 0; i < shipSymbolAt.length; i++) {
            if (shipSymbolAt[i] != 'X'){
                wasDestroyed = false;
                break;
            }
        }

        notifyObserver(c, index, wasDestroyed);
    }

    public Location getFirstLocation(){
        return a;
    }

    public Location getSecondLocation(){
        return b;
    }

    public int getShipLength() { return shipLength; }

    public boolean isValid() { return isValid; }

    public String toString() {
        return shipType;
    }

    public int getMaxAmount() { return maxAmountOfThisType; }

    public char getShipSymbol() { return shipSymbol; }

    public void setShipSymbol(char c){
        shipSymbol = c;
    }

    public boolean checkShipSize(Location a, Location b) {

        // Setup which coordinates need to be checked
        if (a.width == b.width) {
            return Math.abs(a.height - b.height) == shipLength - 1;
        } else {
            return Math.abs(a.width - b.width) == shipLength - 1;
        }

    }

}
