package assignment03;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

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
        PlayerBoard.drawTheBoard();


        /**
         * The loop serves to initialize the players board
         */
        Scoreboard scoreboard = Scoreboard.getInstance();
        int curNumOfShips = 0;
        int numOfCar = 0, numOfBat = 0, numOfSub = 0, numOfPat = 0;

        while (totalNumOfShips > curNumOfShips) {

            // There is an other ship to be placed
            System.out.print("Please enter the position of your ");
            Location tempA = new Location();
            Location tempB = new Location();

            if (fakeCarrier.getMaxAmount() > numOfCar) {
                System.out.print("Carrier " + (numOfCar + 1) + " (Size 6): ");
                readCoordinates(tempA, tempB, in);
                Carrier s = new Carrier(tempA, tempB);
                if (PlayerBoard.safetyCheck(tempA, tempB) && s.isValid()) {
                    PlayerBoard.setShip(s);
                    scoreboard.increaseScoreboard(0,s);

                    numOfCar++;
                    curNumOfShips++;
                } else {
                    System.out.println("The specified input is invalid.");
                }
            } else if (fakeBattleShip.getMaxAmount() > numOfBat) {
                System.out.print("BattleShip " + (numOfBat + 1) + " (Size 4): ");
                readCoordinates(tempA, tempB, in);
                BattleShip s = new BattleShip(tempA, tempB);
                if (PlayerBoard.safetyCheck(tempA, tempB) && s.isValid()) {
                    PlayerBoard.setShip(s);
                    scoreboard.increaseScoreboard(0,s);
                    numOfBat++;
                    curNumOfShips++;
                } else {
                    System.out.println("The specified input is invalid.");
                }
            } else if (fakeSubmarine.getMaxAmount() > numOfSub) {
                System.out.print("Submarine " + (numOfSub + 1) + " (Size 3): ");
                readCoordinates(tempA, tempB, in);
                Submarine s = new Submarine(tempA, tempB);
                if (PlayerBoard.safetyCheck(tempA, tempB) && s.isValid()) {
                    PlayerBoard.setShip(s);
                    scoreboard.increaseScoreboard(0,s);
                    numOfSub++;
                    curNumOfShips++;
                } else {
                    System.out.println("The specified input is invalid.");
                }
            } else if (fakePatrolBoat.getMaxAmount() > numOfPat) {
                System.out.print("Patrol boat " + (numOfPat + 1) + " (Size 2): ");
                readCoordinates(tempA, tempB, in);
                PatrolBoat s = new PatrolBoat(tempA, tempB);
                if (PlayerBoard.safetyCheck(tempA, tempB) && s.isValid()) {
                    PlayerBoard.setShip(s);
                    scoreboard.increaseScoreboard(0,s);
                    numOfPat++;
                    curNumOfShips++;
                } else {
                    System.out.println("The specified input is invalid.");
                }
            } else {
                System.out.print("ERROR: No more ships are needed but the initialization loop wont end.");
            }


        }
        System.out.print("\n");
        System.out.print("Your Board is: \n");
        PlayerBoard.drawTheBoard();
        System.out.print("\n");


        Board enemy = new Board(gridSize);
        AiPlayer eve = new AiPlayer(enemy);

        /**
         * This will have to change it's place. Those to methods make a board for an AI opponent and then print it
         * for debugging purpose.
         */
        //TODO: But this Code Snipped at it's right place.
        eve.fillTheBoard(enemy,scoreboard);
        System.out.println("\n");
        System.out.println("The opponent's Board is: ");
        enemy.drawTheBoard();
        System.out.println("\n");


        int NumOfActualShipsPlayer = 10;
        int NumOfActualShipsAI = 10;

        Location Shot = new Location();

        //while (NumOfActualShipsPlayer > 0 && NumOfActualShipsAI > 0) {

        System.out.print("Enter the position you want to attack: ");
        readCoordiantes(Shot, in);

        //Shoot x = new Shoot(x);
        System.out.println();

    GameMaster gameMaster=new GameMaster();
    gameMaster.get_stuff_iterator(scoreboard,PlayerBoard,enemy);

    while (gameMaster.hasNext()){
        gameMaster.next();
    }



    }


    public static void readCoordiantes(Location x, Scanner read) {

        String input = read.nextLine();

        String LocShot = "";

        while (input.length() > 0) {
            if (input.charAt(0) == ' ') {
                break;
            } else {
                LocShot += input.charAt(0);
            }
            x.update(LocShot);
        }

        //*while (NumOfActualShipsPlayer > 0 && NumOfActualShipsAI > 0) {

        Scanner Shot = new Scanner(System.in);
        System.out.print("Enter the position you want to attack: ");
        Location X = new Location();


    }


    /**
     * Method that reads the input and returns the value within the Locations. haha
     */


        /**
         * Method that reads the input and returns the value within the Locations.
         */
        public static void readCoordinates(Location a, Location b, Scanner read){
            String input = read.nextLine();

            boolean nextLoc = false;

            String LocA = "";
            String LocB = "";

            // separate the two locations
            while (input.length() > 0) {
                if (!nextLoc) {
                    if (input.charAt(0) == ' ') {
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


           /** if ((x >= 0 && x < numRows) && (y >= 0 && y < numCols)) //valid guess
    {
        if (grid[x][y] == "x") //if computer ship is already there; computer loses ship
        {
            System.out.println("Boom! You sunk the ship!");
            grid[x][y] = "!"; //Hit mark
            --BattleShips.computerShips;
        }
        else if (grid[x][y] == "@") {
            System.out.println("Oh no, you sunk your own ship :(");
            grid[x][y] = "x";
            --BattleShips.playerShips;
            ++BattleShips.computerShips;
        }
        else if (grid[x][y] == " ") {
            System.out.println("Sorry, you missed");
            grid[x][y] = "-";
        }
    }
            else if ((x < 0 || x >= numRows) || (y < 0 || y >= numCols))  //invalid guess
            System.out.println("You can't place ships outside the " + numRows + " by " + numCols + " grid");
}while((x < 0 || x >= numRows) || (y < 0 || y >= numCols));  //keep re-prompting till valid guess
        }

}
           /** if ((x >= 0 && x < numRows) && (y >= 0 && y < numCols)) //valid guess
    {
        if (grid[x][y] == "x") //if computer ship is already there; computer loses ship
        {
            System.out.println("Boom! You sunk the ship!");
            grid[x][y] = "!"; //Hit mark
            --BattleShips.computerShips;
        }
        else if (grid[x][y] == "@") {
            System.out.println("Oh no, you sunk your own ship :(");
            grid[x][y] = "x";
            --BattleShips.playerShips;
            ++BattleShips.computerShips;
        }
        else if (grid[x][y] == " ") {
            System.out.println("Sorry, you missed");
            grid[x][y] = "-";
        }
    }
            else if ((x < 0 || x >= numRows) || (y < 0 || y >= numCols))  //invalid guess
            System.out.println("You can't place ships outside the " + numRows + " by " + numCols + " grid");
}while((x < 0 || x >= numRows) || (y < 0 || y >= numCols));  //keep re-prompting till valid guess
        }

            */