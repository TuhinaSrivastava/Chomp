import java.awt.*;

public class MyPlayer {
    public Chip[][] gameBoard;
    public int[] columns;

    public MyPlayer() {
        columns = new int[10];
        int min = 0;
        int max = 3;
        reducer();

        int random_int = (int) Math.floor(Math.random() * (max - min + 1) + min);
        int random_int2 = (int) Math.floor(Math.random() * (max - min + 1) + min);
        int random_int3 = (int) Math.floor(Math.random() * (max - min + 1) + min);
        System.out.println(random_int + "-" + random_int2 + "-" + random_int3);


        for (int i = 1; i < 4; i++) {
            for (int x = 0; x < 4; x++) {
                for (int y = 0; y < 4; y++) {
                    if (i >= x && i >= y && x >= y) {
                        System.out.println(i + "-" + x + "-" + y);
                    }
                    if (i == 1 && x == 0 && y == 0) {
                        System.out.println("losing board!");
                    }
                }
            }
        }
    }
    private static void reducer() {
        for (int a = 3; a > 1; a--) {
            
        }
            for(int b = 3; b > 1; b--){

            }
                for(int c = 3; c > 0; c--){

                }
                    //if(a>=b && a>=c && b>=c){
                        //System.out.println(a + "-" + b + "-" + c);
                    //}

    }

    //add your code to return the row and the column of the chip you want to take.
    //you'll be returning a data type called Point which consists of two integers.

    public Point move(Chip[][] pBoard) {


        gameBoard = pBoard;
        int column = 0;
        int row = 0;

        row = 1;
        column = 1;

        Point myMove = new Point(row, column);




        return myMove;
    }





        }


