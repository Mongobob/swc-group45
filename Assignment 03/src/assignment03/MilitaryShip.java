package assignment03;

import java.util.ArrayList;
import java.util.Arrays;

public class MilitaryShip implements Ship, MyObservable {

    private char shipSymbol;
    private final int shipLength;
    private final int maxAmountOfThisType;
    private boolean isValid;
    private char[] shipSymbolAt;

    private String shipType;
    private ArrayList<MyObserver> myObservers; // new

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
    public void notifyObserver(int index){
        for(int i = 0; i < myObservers.size(); i++){
            myObservers.get(i).update(this, index);
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

    public Location getFirstLocation(){
        return a;
    }

    public Location getSecondLocation(){
        return b;
    }

    public int getShipLength() { return shipLength; }

    public boolean isValid() { return isValid; }

    public String getShipType() {
        return this.shipType;
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
