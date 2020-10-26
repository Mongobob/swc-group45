
import java.util.Scanner;

public class MainAssignment02 {

    public static void main (String[] args) {

        /**
         * This setup is used because we were advised to avoid using static methods because we will be using
         * parallel programming and it is difficult to make a code run in parallel while also have restrictions
         * with static.
         *
         * There for we are adding fake ships and fake location in order to get the general information before
         * we even great a real boat, which we will indeed use.
         */

        // These are the fake locations to create the ships
        Location fakeLocationA = new Location("0A");
        Location fakeLocationB = new Location("0A");

        // These are the fake ships used down in the code
        Ship fakeCarrier = new Carrier(fakeLocationA, fakeLocationB);
        Ship fakeBattleShip = new BattleShip(fakeLocationA, fakeLocationB);
        Ship fakeSubmarine = new Submarine(fakeLocationA, fakeLocationB);
        Ship fakePatrolBoat = new PatrolBoat(fakeLocationA, fakeLocationB);

        // initializing the general variables needed for a round of Battleship
        int totalNumOfShips = fakeCarrier.getMaxAmount() + fakeBattleShip.getMaxAmount() + fakeSubmarine.getMaxAmount()
                + fakePatrolBoat.getMaxAmount();
        int gridSize = 10;
        Board PlayerBoard = new Board(gridSize);

        // Getting the Scanner up and running
        Scanner in = new Scanner(System.in);

        /**
         * Here is were the preparation stops and the game begins.
         */

        // Welcome the player
        System.out.println("Welcome to Battleship!!\n");

        /**
         * The loop serves to initialize the players board
         */

        int curNumOfShips = 0;
        int numOfCar = 0, numOfBat = 0, numOfSub = 0, numOfPat = 0;

        while (totalNumOfShips > curNumOfShips) {

            // There is an other ship to be placed
            System.out.print("Please enter the position of your ");
            Location tempA = new Location();
            Location tempB = new Location();

            if (fakeCarrier.getMaxAmount() > numOfCar) {
                System.out.print("Carrier " + (numOfCar + 1) + ": ");
                readCoordinates(tempA, tempB, in);
                Carrier s = new Carrier(tempA, tempB);
                if(PlayerBoard.safetyCheck(tempA,tempB) && s.isValid()) {
                    PlayerBoard.setShip(s);
                    numOfCar++;
                    curNumOfShips++;
                } else {
                    System.out.println("The specified input is invalid.");
                }
            } else if (fakeBattleShip.getMaxAmount() > numOfBat){
                System.out.print("BattleShip " + (numOfBat + 1) + ": ");
                readCoordinates(tempA, tempB, in);
                BattleShip s = new BattleShip(tempA, tempB);
                if(PlayerBoard.safetyCheck(tempA,tempB) && s.isValid()) {
                    PlayerBoard.setShip(s);
                    numOfBat++;
                    curNumOfShips++;
                } else {
                    System.out.println("The specified input is invalid.");
                }
            } else if (fakeSubmarine.getMaxAmount() > numOfSub) {
                System.out.print("Submarine " + (numOfSub + 1) + ": ");
                readCoordinates(tempA, tempB, in);
                Submarine s = new Submarine(tempA, tempB);
                if(PlayerBoard.safetyCheck(tempA,tempB) && s.isValid()) {
                    PlayerBoard.setShip(s);
                    numOfSub++;
                    curNumOfShips++;
                } else {
                    System.out.println("The specified input is invalid.");
                }
            } else if (fakePatrolBoat.getMaxAmount() > numOfPat) {
                System.out.print("Patrol boat " + (numOfPat + 1) + ": ");
                readCoordinates(tempA, tempB, in);
                PatrolBoat s = new PatrolBoat(tempA, tempB);
                if(PlayerBoard.safetyCheck(tempA,tempB) && s.isValid()) {
                    PlayerBoard.setShip(s);
                    numOfPat++;
                    curNumOfShips++;
                }else {
                    System.out.print("The specified input is invalid.");
                }
            } else {
                System.out.print("ERROR: No more ships are needed but the initialization loop wont end.");
            }

        }

        PlayerBoard.drawTheBoard();
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
            } else {
                LocB += input.charAt(0);
            }
            input = input.substring(1);
        }

        a.update(LocA);
        b.update(LocB);
    }

}