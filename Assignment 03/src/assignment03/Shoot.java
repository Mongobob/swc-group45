/*package assignment03;

import java.util.Scanner;

public class Shoot {

    private Location x;
    private boolean isValid;


    public void fireShot(Location x){
        this.x = x;
        this.isValid();
    }

    public boolean isValid() { return isValid; }

    public void StartOfShooting() {

        Scanner in = new Scanner(System.in);

        int NumberOfPlayerShips = 10;
        int NumberOfCompShips = 10;

        //TODO es fehlt die Liste im Board wo alli werte gspicheret sind aber finde ke weg wieni zuegriff uf die bechume


        //.hitShip(0, 0);
        return;
        while (NumberOfCompShips > 0 || NumberOfPlayerShips > 0) {

            System.out.println("Enter the position you want to attack");

            Location x = new Location();


            }


        }
    }





    public void readCoordinateOfShoot(Location x, Scanner read) {

        String input = read.nextLine();

        boolean nextLoc = false;

        String LocX = "";

        while (input.length() > 0) {
            if (!nextLoc) {
                if (input.charAt(0) == ' ') {
                    nextLoc = true;
                } else {
                    LocX += input.charAt(0);
                }

            }
            x.update(LocX);

        }


    }
    }




    /*
        Random rand = new Random();

        int i, j;

        List<Point> PointsToTry= new ArrayList<Point>();
        for (i = 0; i <= 10; i ++){
            for (j = 0; j <= 10; j++){
                PointsToTry.add(new Point(i, j));
            }
        }

        int h = rand.nextInt(PointsToTry.size());
        Point shot = PointsToTry.remove(h);

        Board ShipCoord = new Board();
        List<Integer> ShipCoordinates = ShipCoord.setShip();

        return true;*/