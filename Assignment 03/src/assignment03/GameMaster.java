package assignment03;

import java.util.ArrayList;


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


    public void get_stuff_iterator(Scoreboard scoreboard,Board player, Board enemyshot){
        int[] score=scoreboard.getScoreboard();
        this.playerscore= score[1];
        this.aiscore = score[0];
        this.scoreboard=scoreboard;
        this.player=player;
        this.enemy=enemyshot;

    }
    public Object next(){return "True";}

       // scoreboard.printScoreboard();
        //Scoreboard;
        //AI-Player shoots
        //Player shoots

        //player.drawTheBoard();

        //Show own board
        //Show opponent's board



    //}

    //public boolean hasNext(){
      //  if (totalNumOfShips > curNumOfShips) {
        //    return true;
       // } else {
         //   return false;

        //}
    //}
//}

 //   return 0;
   // }

    public boolean hasNext() {
        if (playerscore==-1 || aiscore==-1) {
            System.out.println("Scoreboard could not be implemented correctly");
            return false;
        }
        else if (aiscore==0){
            System.out.println("Congratulations, you won!");
            return false;
        }
        else if (playerscore==0){
            System.out.println("Sorry, you lost!");
            return false;
    }
        else{return true;
        }
    }
}
