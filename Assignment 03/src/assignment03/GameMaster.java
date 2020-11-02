package assignment03;

import java.util.ArrayList;
import java.util.Scanner;


// I will be using this as Iterator

//public class GameMaster {
  //  PlayerItem[] pitems;
    //AIItem[] aitems;

public class GameMaster implements Iterator {

    int playerscore=-1;
    int aiscore=-1;
    Scoreboard scoreboard;
    Board player;
    Board enemy;
    AiPlayer glados;
    Scanner read = new Scanner(System.in);


    public void get_stuff_iterator(Scoreboard scoreboard, Board player, Board enemyShot, AiPlayer glados){
        int[] score=scoreboard.getScoreboard();
        this.playerscore= score[1];
        this.aiscore = score[0];
        this.scoreboard=scoreboard;
        this.player=player;
        this.enemy=enemyShot;
        this.glados=glados;

    }

    public Object next(){

        // Scoreboard
        System.out.println("");
        Scoreboard.getInstance().printScoreboard();

        // Player shoots
        enemy.shoot(attackCoordinates());

        // AI-Player shoots
        Location a = glados.getRandLoc(enemy);
        System.out.println("The computer attacks position " + a.toString());
        player.shoot(a);

        // Draw Player Board
        System.out.println("\nYour board is:\n");
        player.drawTheBoard();

        // Show opponent's board
        System.out.println("\nThe opponent's board is:\n");
        enemy.drawTheBoard();

        return "nihil";
    }


    public boolean hasNext() {
        playerscore=scoreboard.getScoreboard()[1];
        aiscore=scoreboard.getScoreboard()[0];
        if (playerscore==-1 || aiscore==-1) {
            System.out.println("Scoreboard could not be implemented correctly");
            return false;
        } else if (aiscore<1) {
            System.out.println("Congratulations, you won!");
            return false;
        } else if (playerscore<1) {
            System.out.println("Sorry, you lost!");
            return false;
        } else {
            return true;
        }
    }

    private Location attackCoordinates() {

        System.out.print("\nEnter the position you want to attack: ");

        Location a = new Location();
        int iterations = 0;

        while(!a.isValid(enemy.getGridSize())){

            if(iterations != 0){
                System.out.print("The specified input is invalid.\nEnter the position you want to attack: ");
            }
            String input = read.nextLine();
            a.update(input);
            iterations++;
        }

        return a;
    }

}
