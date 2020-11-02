package assignment03;

/**
 *  This is a helper class to simplify the actions within the other classes.
 *  It safes the inputs of strings as integers and checks if they fit the
 *  description. If not, then the constructor will simply return null.
 */

class Location {

    public int width = -1;
    public int height = -1;

    // The constructor method
    public Location(String s){
        StringToCor(s);
    }

    // The constructor method that uses integers instead of a String
    public Location(int w, int h) {
        this.width = w;
        this.height = h;
    }

    // Default constructor method for invalid places
    public Location(){}

    // Method to update Location that may be invalid
    public void update(String s){
        StringToCor(s);
    }

    /** A method that checks if this location is valid or not. */
    public boolean isValid(int GridSize) {
        return this.width >= 0 && this.width < GridSize && this.height >= 0 && this.height < GridSize;
    }

    /** A method that checks if two locations are diagonal to each other. */
    public boolean isDiagonal(Location alt) {
        return this.width != alt.width && this.height != alt.height;
    }


    /** A method that turns the given string into the needed coordinates.
     *
     * @param s - a String consisting of a capital letter (A - J) followed
     *        by a number (0 - 9) representing a location on the board.
     *        Like E9, A0, D2 etc.
     */
    private void StringToCor(String s){
        if (s.length() == 2) { // check if the given String fits has the right length

            char width  = s.charAt(0);
            char height = s.charAt(1);

            // check if first char capital letter
            switch (width) {
                case 'A' -> this.width = 0;
                case 'B' -> this.width = 1;
                case 'C' -> this.width = 2;
                case 'D' -> this.width = 3;
                case 'E' -> this.width = 4;
                case 'F' -> this.width = 5;
                case 'G' -> this.width = 6;
                case 'H' -> this.width = 7;
                case 'I' -> this.width = 8;
                case 'J' -> this.width = 9;
                default -> this.width = -1; // if not => invalid location
            }

            // check if second char value 0 - 9
            switch (height) {
                case '0' -> this.height = 0;
                case '1' -> this.height = 1;
                case '2' -> this.height = 2;
                case '3' -> this.height = 3;
                case '4' -> this.height = 4;
                case '5' -> this.height = 5;
                case '6' -> this.height = 6;
                case '7' -> this.height = 7;
                case '8' -> this.height = 8;
                case '9' -> this.height = 9;
                default -> this.height = -1; // if not => invalid location
            }

        } else { // if s doesn't fit description => set invalid location
            this.height = -1;
            this.width = -1 ;
        }
    }

    /**
     * (New) Due to console output challenges.
     */
    public String toString(){

        String w = "";

        switch (this.width) {
            case 0 -> w += 'A';
            case 1 -> w += 'B';
            case 2 -> w += 'C';
            case 3 -> w += 'D';
            case 4 -> w += 'E';
            case 5 -> w += 'F';
            case 6 -> w += 'G';
            case 7 -> w += 'H';
            case 8 -> w += 'I';
            case 9 -> w += 'J';
            default -> w += 'Z'; // if not => invalid location
        }

        return (w + this.height);
    }

}