package assignment03;

import javax.security.auth.Subject;
import java.awt.*;
import java.util.ArrayList;

class Board implements MyObserver{

    private Ship[][] grid;
    private char[][] visualBoard; // (new) Will contain all the symbols for the drawBoard method.
    private int gridSize;
    private boolean isForPlayer; // (new) Distinction between the board for player and the one for the AI

    public Board(int gridSize, boolean isForPlayer) {
        this.grid = new Ship[gridSize][gridSize];
        this.visualBoard = new char[gridSize][gridSize]; // create the visual representation of the Board
        this.gridSize = gridSize;
        this.isForPlayer = isForPlayer;

        // initializing all the positions with a blank space
        for(int i = 0; i < gridSize; i++){
            for(int h = 0; h < gridSize; h++){
                visualBoard[i][h] = ' ';
            }
        }

    }

    // returns the size of the grid
    public int getGridSize() {
        return gridSize;
    }


    /**
     * Method that draws the board at the end.
     */
    public void drawTheBoard() {

        char[] alphabet = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O'};


        // printing the header
        System.out.print("   |");
        for (int i = 0; i < grid.length; i++) {
            System.out.print("[" + alphabet[i] + "]");
        }
        System.out.print("\n");

        System.out.print("---|");
        for (int i = 0; i < grid.length; i++) {
            System.out.print("---");
        }
        System.out.print("\n");

        // printing the actual board
        for (int h = 0; h < grid[0].length; h++) {
            System.out.print("[" + h + "]|");
            for (int i = 0; i < grid.length; i++) {
                System.out.print("[" + visualBoard[i][h] + "]");
            }
            System.out.print("\n");
        }
    }

    /**
     * A safety check to make sure the given inputs are correct.
     */
    public boolean safetyCheck(Location a, Location b) {

        return a.isValid(gridSize) && b.isValid(gridSize) && !a.isDiagonal(b) && boardIsFree(a, b);
    }

    /**
     * An other safety check to make sure the place on the board isn't taken yet.
     */
    public boolean boardIsFree(Location a, Location b) {
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
        for (int i = minCol; i <= maxCol; i++) {
            for (int h = minRow; h <= maxRow; h++) {
                if (grid[i][h] != null) { // check if one of the spaces is occupied
                    return false; // if even one is occupied the input is invalid.
                }
            }
        }

        // if we're done with filling out everything we can return with a true
        return true;

    }


    public void setShip(Ship s) {
        int minRow, minCol, maxRow, maxCol;
        Location a = s.getFirstLocation();
        Location b = s.getSecondLocation();

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

        // if all the spaces are free we can fill them up now
        for (int i = minCol; i <= maxCol; i++) {
            for (int h = minRow; h <= maxRow; h++) {
                grid[i][h] = s;
                if(isForPlayer){ // if it is the player's board we can also display the shipSymbols
                    visualBoard[i][h] = s.getShipSymbol();
                }
            }
        }

    }

    // turn the ShipSymbol into X if we hit
    public void hitShip(int a, int b){
        grid[a][b].setShipSymbol('X');
    }

    /**
     * This is invoked whenever a ship is hit. From the AI but also from the Player.
     * The Observable is a ship in all the cases.
     */
    public void update(Ship s, int index) {
        int minRow, minCol, maxRow, maxCol;
        Location a = s.getFirstLocation();
        Location b = s.getSecondLocation();

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

        if(minCol == maxCol){
            visualBoard[minCol][minRow + index] = s.getShipSymbolAt(index); // needs to be updated, need shipSymbol@index
        } else {
            visualBoard[minCol + index][minRow] = s.getShipSymbolAt(index); // ... same here
        }

    }

    /**
     * This is also a new method. It let's the player and the AI shoot at the
     * board and eventually hit the targets.
     */
    public void shoot(Location a){
        if(grid[a.width][a.height] == null){
            visualBoard[a.width][a.height] = 'O';
        } else {
            // TODO: Implement what happens when a target was hit.
        }
    }

    /** Code from Josip to determine where a certain Symbol should come.
     * if(!enemy || (enemy && (grid[i][h].getShipSymbol()=='X') || (enemy &&grid[i][h].getShipSymbol()=='O')
     *                               || (enemy && grid[i][h].getHits() == grid[i][h].getShipLength()))){
     *                         System.out.print("" + grid[i][h].getShipSymbol() + "");
     *                     }
     *                     if (grid[i][h] != null){
     *
     *                     else{
     *                         System.out.print(" ");
     *                     }
     *                 }
     *                 else {
     *                     System.out.print(" ");
     *                 }
     */
}
