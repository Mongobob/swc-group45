/**
 *  This is a helper class to simplify the actions within the other classes.
 *  It safes the inputs of strings as integers and checks if they fit the
 *  description. If not, then the constructor will simply return null.
 */

public class Location {

    public int width;
    public int height;

    // The constructor method
    public Location(String s){
        StringToCor(s);
    }

    // Default constructor method for invalid places
    public Location(){
        this.width  = -1;
        this.height = -1;
    }

    // Method to update Location that may be invalid
    public void update(String s){
        StringToCor(s);
    }

    /** A method that checks if this location is valid or not. */
    public boolean isValid(int GridSize) {
        if (this.width >= 0 && this.width < GridSize && this.height >= 0 && this.height < GridSize) {
            return true;
        } else {
            return false;
        }
    }

    /** A method that checks if two locations are diagonal to each other. */
    public boolean isDiag(Location alt) {
        if(this.width == alt.width || this.height == alt.height) {
            return false;
        } else {
            return true;
        }
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

            switch (width) { // check if first char capital letter
                case 'A': this.width = 0; break;
                case 'B': this.width = 1; break;
                case 'C': this.width = 2; break;
                case 'D': this.width = 3; break;
                case 'E': this.width = 4; break;
                case 'F': this.width = 5; break;
                case 'G': this.width = 6; break;
                case 'H': this.width = 7; break;
                case 'I': this.width = 8; break;
                case 'J': this.width = 9; break;
                default : this.width = -1; // if not => invalid location
            }

            switch (height) { // check if second char value 0 - 9
                case '0': this.height = 0; break;
                case '1': this.height = 1; break;
                case '2': this.height = 2; break;
                case '3': this.height = 3; break;
                case '4': this.height = 4; break;
                case '5': this.height = 5; break;
                case '6': this.height = 6; break;
                case '7': this.height = 7; break;
                case '8': this.height = 8; break;
                case '9': this.height = 9; break;
                default : this.height = -1; // if not => invalid location
            }

        } else { // if s doesn't fit description => set invalid location
            this.height = -1;
            this.width = -1 ;
        }
    }
}