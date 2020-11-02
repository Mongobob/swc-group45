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

}
