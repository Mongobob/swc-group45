package assignment03;

class BattleShip extends MilitaryShip {

    /**
     * Here are the values for the Military Ship Type CARRIER:
     * - shipSymbol = 'B'
     * - shipLength = 4
     * - maxAmountOfThisType = 2;
     * - hits = 0;
     * - shipType = "PatrolBoat";
     */

    private int shipID = 0;
    private int myShipID;

    public BattleShip(Location a, Location b){
        super('B', 4, 2, a, b, "BattleShip");
        myShipID = ++shipID;
    }

    @Override
    public String toString() {
        return (super.toString() + myShipID);
    }

    
}
