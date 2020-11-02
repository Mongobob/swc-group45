package assignment03;

class Submarine implements Ship {

    char shipSymbol = 'S';
    private final int shipLength = 3;
    private final int maxAmountOfThisType = 0;//3
    private boolean isValid;
    private int hits = 0;

    private String shipType = "Submarine";

    private Location a;
    private Location b;

    public Submarine(Location a, Location b){
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

    }

}
