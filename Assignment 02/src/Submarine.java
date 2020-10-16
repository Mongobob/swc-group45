public class Submarine implements Ship {

    private final char ShipSymbol = 'S';
    private static final int ShipLength = 3;
    private static int AmountOfShips = 3;
    private static int counter = 1;

    private String ShipType = "Submarine";

    private Location a;
    private Location b;

    public Submarine(Location a, Location b) {
        this.a = a;
        this.b = b;
        counter++;
    }

    public static int getCounter(){
        return counter;
    }

    public Location getFirstLocation(){
        return a;
    }

    public Location getSecondLocation(){
        return b;
    }

    @Override
    public String getShipType() {
        return ShipType;
    }

    public static int getAmountOfShip() {
        return AmountOfShips;
    }

    public char getShipSymbol() { return ShipSymbol; }

    public static boolean checkShipSize(Location a, Location b) {

        // Setup which coordinates need to be checked
        if (a.width == b.width) {
            return Math.abs(a.height - b.height) == ShipLength - 1;
        } else {
            return Math.abs(a.width - b.width) == ShipLength - 1;
        }

    }

    public static void reduceNumbersLeft() {
        AmountOfShips--;
    }

}
