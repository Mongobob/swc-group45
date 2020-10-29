package assignment03;

class Board {

    private Ship[][] grid;
    private int gridSize;

    public Board(int gridSize){
        grid = new Ship[gridSize][gridSize];
        this.gridSize = gridSize;

        for (int i = 0; i<gridSize;i++){
            System.out.println(grid.length);
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

        System.out.println("Your board is:\n");

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
                System.out.print("[");
                if (grid[i][h]!= null) {
                    System.out.print("" + grid[i][h].getShipSymbol() + "");
                } else {
                    System.out.print(" ");
                }
                System.out.print("]");
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
            }
        }
    }
}