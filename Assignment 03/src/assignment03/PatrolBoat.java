package assignment03;

class PatrolBoat extends MilitaryShip {

    /**
     * Here are the values for the Military Ship Type CARRIER:
     * - shipSymbol = 'P'
     * - shipLength = 2
     * - maxAmountOfThisType = 4;
     * - hits = 0;
     * - shipType = "PatrolBoat";
     */

    public PatrolBoat(Location a, Location b){
        super('P', 2, 4, a, b, "PatrolBoat");
    }

    /**
     * Original Code is still here in Case I messed up.
     * De-Comment the code below and delete the part above
     * as well as the MilitaryShip Class in order to restore
     * original.
     */

    /*char shipSymbol = 'P';
    private final int shipLength = 2;
    private final int maxAmountOfThisType = 4; //4
    private boolean isValid;
    private int hits = 0;

    private String shipType = "Patrol Boat";

    private Location a;
    private Location b;

    public PatrolBoat(Location a, Location b){
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
