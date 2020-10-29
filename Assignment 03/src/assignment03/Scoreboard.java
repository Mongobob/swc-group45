package assignment03;

//Todo:     -   replace amount of ships in getScoreboard()
//Todo:     -   Write a way to include amount of ships variables into the class


public class Scoreboard {
    private volatile static Scoreboard uniqueInstance;

    // instance variables coming here
    private Scoreboard(){}

    public static Scoreboard getInstance(){
        if (uniqueInstance == null){
            synchronized (Scoreboard.class){
                if (uniqueInstance==null){
                    uniqueInstance = new Scoreboard();
                }
            }
        }
    }

    private void getScoreboard(){
        System.out.print("Your scoreboard: \n");
        System.out.print("  -    Player remaining boats:    numofships \n");
        System.out.print("  -    Enemy boats destroyed:     numofships \n");
    }
    //methods coming here
}
