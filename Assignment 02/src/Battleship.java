import java.util.Scanner;

public class Battleship {

    public static void main (String[] args) {

        // TODO add ship types in order to check

        // ramifications
        int GridSize        = 10;

        int numOfCarrier    = 1;
        int numOfBattleship = 2;
        int numOfSubmarine  = 3;
        int numOfPatrolBoat = 4;

        int totalNumOfShips = numOfBattleship + numOfCarrier + numOfSubmarine + numOfPatrolBoat;
        boolean[][] Board = new boolean[GridSize][GridSize];

        // Getting the Scanner up and running
        Scanner in = new Scanner(System.in);

        // Welcome the player
        System.out.println("Welcome to Battleship!!\n");

        while (totalNumOfShips > 0) {

            // There is an other ship to be placed
            System.out.print("Please enter the position of your ");
            Location tempA = new Location();
            Location tempB = new Location();

            if (numOfCarrier > 0) {
                System.out.print("Carrier: ");
                readCoordinates(tempA, tempB, in);
                if(safetyCheck(GridSize,tempA,tempB,Board)) {
                    numOfCarrier--;
                }
            } else if (numOfBattleship > 0){
                System.out.print("BattleShip: ");
                readCoordinates(tempA, tempB, in);
                if(safetyCheck(GridSize,tempA,tempB,Board)) {
                    numOfBattleship--;
                }
            } else if (numOfSubmarine > 0) {
                System.out.print("Submarine: ");
                readCoordinates(tempA, tempB, in);
                if(safetyCheck(GridSize,tempA,tempB,Board)) {
                    numOfSubmarine--;
                }
            } else if (numOfPatrolBoat > 0) {
                System.out.print("Patrol boat: ");
                readCoordinates(tempA, tempB, in);
                if(safetyCheck(GridSize,tempA,tempB,Board)) {
                    numOfPatrolBoat--;
                }
            }

            System.out.print("\n");
            totalNumOfShips--;
        }

        drawTheBoard(Board);
    }

    /** Method that reads the input and returns the value within the Locations. */
    public static void readCoordinates(Location a, Location b, Scanner read){
        String input = read.nextLine();

        boolean nextLoc = false;

        String LocA = "";
        String LocB = "";

        // separate the two locations
        while(input.length() > 0) {
            if(!nextLoc) {
                if(input.charAt(0) == ' '){
                    nextLoc = true;
                } else {
                    LocA += input.charAt(0);
                }
                input = input.substring(1);
            } else {
                LocB += input.charAt(0);
                input = input.substring(1);
            }
        }

        a.update(LocA);
        b.update(LocB);
    }

    /** Method that draws the board at the end. */
    public static void drawTheBoard(boolean[][] Board){

        char[] alphabet = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O'};

        System.out.println("Your board is:\n");

        // printing the header
        System.out.print("   |");
        for(int i = 0; i < Board.length; i++){
            System.out.print("[" + alphabet[i] + "]");
        }
        System.out.print("\n");

        System.out.print("---|");
        for(int i = 0; i < Board.length; i++){
            System.out.print("---");
        }
        System.out.print("\n");

        // printing the actual board
        for(int h = 0; h < Board[0].length; h++) {
            System.out.print("[" + h + "]|");
            for(int i = 0; i < Board.length; i++) {
                System.out.print("[");
                if(Board[i][h]) {
                    // TODO add a method were depending on the ship type there is an other letter corresponding to it
                    System.out.print("x");
                } else {
                    System.out.print(" ");
                }
                System.out.print("]");
            }
            System.out.print("\n");
        }
    }

    /** A safety check to make sure the given inputs are correct. */
    public static boolean safetyCheck(int GridSize, Location a, Location b, boolean[][] Board) {
        // TODO add another check, if the size of the ship was considered
        if(a.isValid(GridSize) && b.isValid(GridSize) && !a.isDiag(b) && boardIsFree(a,b,Board)) {
            return true;
        } else {
            System.out.println("The specified input is invalid");
            return false;
        }
    }

    /** An other safety check to make sure the place on the board isn't taken yet. */
    public static boolean boardIsFree(Location a, Location b, boolean[][] Board){
        int minRow, minCol, maxRow, maxCol;

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

        // checking the board if the space is free
        for(int i = minCol; i <= maxCol; i++){
            for(int h = minRow; h <= maxRow; h++){
                if(Board[i][h]) { // check if one of the spaces is occupied
                    return false; // if even one is occupied the input is invalid.
                }
            }
        }

        // if all the spaces are free we can fill them up now
        for(int i = minCol; i <= maxCol; i++){
            for(int h = minRow; h <= maxRow; h++){
                Board[i][h] = true;
            }
        }

        // if we're done with filling out everything we can return with a true
        return true;

    }
}