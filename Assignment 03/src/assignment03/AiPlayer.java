package assignment03;

import java.util.ArrayList;
import java.util.Random;

class AiPlayer {

    //TODO: make this class look better and more understandable

    //TODO: make it more reliable. Maybe even DP to find new valid Locations.

    private Board myBoard;
    private Random rand = new Random();

    public AiPlayer(Board b){
        myBoard = b;
    }

    public void fillTheBoard(Board board){

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

        int curNumOfShips = 0;
        int numOfCar = 0, numOfBat = 0, numOfSub = 0, numOfPat = 0;

        while (totalNumOfShips > curNumOfShips) {

            // There is an other ship to be placed
            Location tempA = new Location();
            Location tempB = new Location();

            if (fakeCarrier.getMaxAmount() > numOfCar) {
                tempA = getRandLoc(board);
                tempB = getFollowingLoc(tempA, fakeCarrier.getShipLength());
                Carrier s = new Carrier(tempA, tempB);
                if(myBoard.safetyCheck(tempA,tempB) && s.isValid()) {
                    myBoard.setShip(s);
                    numOfCar++;
                    curNumOfShips++;
                }
            } else if (fakeBattleShip.getMaxAmount() > numOfBat){
                tempA = getRandLoc(board);
                tempB = getFollowingLoc(tempA, fakeBattleShip.getShipLength());
                BattleShip s = new BattleShip(tempA, tempB);
                if(myBoard.safetyCheck(tempA,tempB) && s.isValid()) {
                    myBoard.setShip(s);
                    numOfBat++;
                    curNumOfShips++;
                }
            } else if (fakeSubmarine.getMaxAmount() > numOfSub) {
                tempA = getRandLoc(board);
                tempB = getFollowingLoc(tempA, fakeSubmarine.getShipLength());
                Submarine s = new Submarine(tempA, tempB);
                if(myBoard.safetyCheck(tempA,tempB) && s.isValid()) {
                    myBoard.setShip(s);
                    numOfSub++;
                    curNumOfShips++;
                }
            } else if (fakePatrolBoat.getMaxAmount() > numOfPat) {
                tempA = getRandLoc(board);
                tempB = getFollowingLoc(tempA, fakePatrolBoat.getShipLength());
                PatrolBoat s = new PatrolBoat(tempA, tempB);
                if(myBoard.safetyCheck(tempA,tempB) && s.isValid()) {
                    myBoard.setShip(s);
                    numOfPat++;
                    curNumOfShips++;
                }
            } else {
                System.out.print("ERROR: No more ships are needed but the initialization loop wont end.");
            }

        }

    }

    private Location getFollowingLoc(Location a, int shipSize) {

        ArrayList<Location> posChoices = new ArrayList<Location>();

        Location bUp, bRight, bDown, bLeft;

        bUp = new Location(a.width, a.height - (shipSize - 1));
        bRight = new Location(a.width + (shipSize - 1), a.height);
        bDown = new Location(a.width, a.height + (shipSize - 1));
        bLeft = new Location(a.width - (shipSize - 1), a.height);

        if(myBoard.safetyCheck(a, bUp)) {
            posChoices.add(bUp);
        }
        if(myBoard.safetyCheck(a, bRight)) {
            posChoices.add(bRight);
        }
        if(myBoard.safetyCheck(a, bDown)) {
            posChoices.add(bDown);
        }
        if(myBoard.safetyCheck(a, bLeft)) {
            posChoices.add(bLeft);
        }

        if(!posChoices.isEmpty()) {
            int direction = rand.nextInt(posChoices.size());
            return posChoices.get(direction);
        } else {
            return new Location();
        }

    }

    private Location getRandLoc(Board b) {

        int gridSize = b.getGridSize();

        int x = rand.nextInt(gridSize);
        int y = rand.nextInt(gridSize);

        return new Location(x,y);

    }

}
