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

    private int shipID = 0;
    private int myShipID;

    public PatrolBoat(Location a, Location b){
        super('P', 2, 4, a, b, "PatrolBoat");myShipID = ++shipID;
    }

    @Override
    public String toString() {
        return (super.toString() + myShipID);
    }
}
