package assignment03;

//Todo:     -   replace amount of ships in getScoreboard()
//Todo:     -   Write a way to include amount of ships variables into the class

import java.util.ArrayList;
import java.util.List;

public class Scoreboard {
    private volatile static Scoreboard uniqueInstance;

    List<Ship> ArrayPlayer= new ArrayList<Ship>();
    List<Ship> ArrayAI= new ArrayList<Ship>();
    int destroyedShips = 0;

    // instance variables coming here
    private Scoreboard(){}



    public static  Scoreboard getInstance(){
        if (uniqueInstance == null){
            synchronized (Scoreboard.class){
                if (uniqueInstance==null){
                    uniqueInstance = new Scoreboard();
                }
            }
        }
        return uniqueInstance;
    }
    public void increaseScoreboard(int player, Ship ship){
        //Array mit allen Schiffen, welche auf dem Spiel sind
        if (player==0){//wenn es Spieler ist
            ArrayPlayer.add(ship);

        }else{//wenn es AI ist
            ArrayAI.add(ship);
        }
    }

    public void decreaseScoreboard(int player, Ship ship) {
        //for ship in array: if ship = ours, then delete
        if (player == 0) { //wenn es Spieler ist
            ArrayPlayer.remove(ship);
        } else {//wenn es AI ist
            ArrayAI.remove(ship);
            destroyedShips--;
        }
    }

    public void getScoreboard(){
        System.out.print("Your scoreboard: \n");
        System.out.print("  -    Player remaining boats:    numofships \n" + ArrayPlayer.size());
        System.out.print("  -    Enemy boats destroyed:     numofships \n" + (destroyedShips));
    }

}
