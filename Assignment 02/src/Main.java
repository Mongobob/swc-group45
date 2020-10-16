
import java.util.Scanner;

public class Main {

    public static void main (String[] args) {

        // TODO add ship types in order to check

        // ramifications
        int GridSize = 10;

        int totalNumOfShips = BattleShip.getAmountOfShip() + Carrier.getAmountOfShip() + Submarine.getAmountOfShip() + PatrolBoat.getAmountOfShip();
        /**boolean[][] Board = new boolean[GridSize][GridSize];*/
        Board GameBoard = new Board(GridSize);

        // Getting the Scanner up and running
        Scanner in = new Scanner(System.in);

        // Welcome the player
        System.out.println("Welcome to Battleship!!\n");

        // Ship q = new Carrier(new Location("E9"), new Location("J9"));
        // System.out.print("The specified input is invalid.");

        while (totalNumOfShips > 0) {

            // There is an other ship to be placed
            System.out.print("Please enter the position of your ");
            Location tempA = new Location();
            Location tempB = new Location();

            if (Carrier.getAmountOfShip() > 0) {
                System.out.print("Carrier " + Carrier.getCounter() + ": ");
                readCoordinates(tempA, tempB, in);
                if(GameBoard.safetyCheck(tempA,tempB)) {
                    if(Carrier.checkShipSize(tempA,tempB)) {
                        Carrier s = new Carrier(tempA, tempB);
                        GameBoard.setShip(s);
                        Carrier.reduceNumbersLeft();
                    } else {
                        System.out.print("The specified input is invalid.");
                    }
                } else {
                    System.out.print("The specified input is invalid.");
                }
            } else if (BattleShip.getAmountOfShip() > 0){
                System.out.print("BattleShip " + BattleShip.getCounter() + ": ");
                readCoordinates(tempA, tempB, in);
                if(GameBoard.safetyCheck(tempA,tempB)) {
                    if(BattleShip.checkShipSize(tempA,tempB)) {
                        BattleShip s = new BattleShip(tempA, tempB);
                        GameBoard.setShip(s);
                        BattleShip.reduceNumbersLeft();
                    }else {
                        System.out.print("The specified input is invalid.");
                    }
                } else {
                    System.out.print("The specified input is invalid.");
                }
            } else if (Submarine.getAmountOfShip() > 0) {
                System.out.print("Submarine " + Submarine.getCounter() + ": ");
                readCoordinates(tempA, tempB, in);
                if(GameBoard.safetyCheck(tempA,tempB)) {
                    if(Submarine.checkShipSize(tempA,tempB)) {
                        Submarine s = new Submarine(tempA, tempB);
                        GameBoard.setShip(s);
                        Submarine.reduceNumbersLeft();
                    }else {
                        System.out.print("The specified input is invalid.");
                    }
                } else {
                    System.out.print("The specified input is invalid.");
                }
            } else if (PatrolBoat.getAmountOfShip() > 0) {
                System.out.print("Patrol boat " + PatrolBoat.getCounter() + ": ");
                readCoordinates(tempA, tempB, in);
                if(GameBoard.safetyCheck(tempA,tempB)) {
                    if(PatrolBoat.checkShipSize(tempA,tempB)) {
                        PatrolBoat s = new PatrolBoat(tempA, tempB);
                        GameBoard.setShip(s);
                        PatrolBoat.reduceNumbersLeft();
                    }
                }else {
                    System.out.print("The specified input is invalid.");
                }
            } else {
                System.out.print("The specified input is invalid.");
            }

            totalNumOfShips--;
        }

        GameBoard.drawTheBoard();
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

}