package assignment03;

class Submarine extends MilitaryShip {

    /**
     * Here are the values for the Military Ship Type CARRIER:
     * - shipSymbol = 'S'
     * - shipLength = 3
     * - maxAmountOfThisType = 3;
     * - hits = 0;
     * - shipType = "Carrier";
     */

    private int shipID = 0;
    private int myShipID;

    public Submarine(Location a, Location b){
        super('S', 3, 3, a, b, "Carrier");
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

    /*char shipSymbol = 'S';
    private final int shipLength = 3;
    private final int maxAmountOfThisType = 3;//3
    private boolean isValid;
    private int hits = 0;

    private String shipType = "Submarine";

    private Location a;
    private Location b;

    public Submarine(Location a, Location b){
        this.a = a;
        this.b = b;
        this.isValid = checkShipSize(a, b);
    }*/



/**
    public void CoorArray() {
        int minRow, minCol, maxRow, maxCol;
        Location a = this.a;
        Location b = this.b;

        // Setup which coordinates need to be checked
        if (a.width == b.width) {
            minCol = a.width;
            maxCol = a.width;
            if (a.height < b.height) {
                minRow = a.height;
                maxRow = b.height;
            } else {
                minRow = b.height;
                maxRow = a.height;
            }
        } else {
            minRow = a.height;
            maxRow = a.height;
            if (a.width < b.width) {
                minCol = a.width;
                maxCol = b.width;
            } else {
                minCol = b.width;
                maxCol = a.width;
            }
        }
        for (int i = minCol; i <= maxCol; i++) {
            for (int h = minRow; h <= maxRow; h++) {
                grid[i][h] = s;
                ShipCoordinatesPlayer.add(i, h);

            }
        }
    }
**/
    /*public Location getFirstLocation(){ return a; }

    public Location getSecondLocation(){
        return b;
    }

    public int getShipLength() { return shipLength; }

    public boolean isValid() { return isValid; }

    public String getShipType() {
        return shipType;
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
