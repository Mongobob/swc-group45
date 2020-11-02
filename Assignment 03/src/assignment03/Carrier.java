package assignment03;

class Carrier extends MilitaryShip {

    /**
     * Here are the values for the Military Ship Type CARRIER:
     * - shipSymbol = 'C'
     * - shipLength = 6
     * - maxAmountOfThisType = 1;
     * - hits = 0;
     * - shipType = "Carrier";
     */

    private int shipID = 0;
    private int myShipID;

    public Carrier(Location a, Location b){
        super('C', 6, 1, a, b, "Carrier");
        myShipID = ++shipID;
    }

    @Override
    public String toString() {
        return (super.toString() + myShipID);
    }

    /**
     * Original Code is still here in Case I messed up.
     * De-Comment the code below and delete the part above
     * as well as the MilitaryShip Class in order to restore
     * original.
     */


    /*char shipSymbol = 'C';
    private final int shipLength = 6;
    private final int maxAmountOfThisType = 1;
    private boolean isValid;
    private int hits = 0;

    private String shipType = "Carrier";

    private Location a;
    private Location b;

    public Carrier(Location a, Location b){
        this.a = a;
        this.b = b;
        this.isValid = checkShipSize(a, b);
    }

    public Location getFirstLocation(){ return a; }

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

    public int getHits(){return hits;}

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

    }*/

}




