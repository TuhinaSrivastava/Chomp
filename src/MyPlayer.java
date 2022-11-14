import java.awt.*;

public class MyPlayer {
    public Chip[][] gameBoard;
    public int[] columns;

    public MyPlayer() {
        columns = new int[10];
        int min = 0;
        int max = 3;
        reducer(3, 3, 3);

        /*int random_int = (int) Math.floor(Math.random() * (max - min + 1) + min);
        int random_int2 = (int) Math.floor(Math.random() * (max - min + 1) + min);
        int random_int3 = (int) Math.floor(Math.random() * (max - min + 1) + min);
        System.out.println(random_int + "-" + random_int2 + "-" + random_int3);*/


        for (int i = 1; i < 4; i++) {
            for (int h = 0; h < 4; h++) {
                for (int g = 0; g < 4; g++) {
                    if (i >= h && i >= g && h >= g) {
                        System.out.println("REDUCER");
                        System.out.println(i + "-" + h + "-" + g);
                        reducer(i, h, g);
                    }
                }
            }
        }
    }

    public void reducer(int x, int y, int z) {
        if (z > 0) {

            for (int c = z - 1; c > -1; c--) {

                System.out.println(x + "-" + y + "-" + c);

            }
            for (int b = y - 1; b > -1; b--) {
                if (b > z) {
                    System.out.println(x + "-" + b + "-" + z);
                } else {
                    System.out.println(x + "-" + b + "-" + b);

                }
            }
            for (int a = x - 1; a > 0; a--) {
                if (a > y && y > z) {
                    System.out.println(a + "-" + y + "-" + z);
                } else {
                    if (z > a) {
                        System.out.println(a + "-" + a + "-" + a);

                    } else {
                        System.out.println(a + "-" + a + "-" + z);
                    }
                }

            }
        } else if (y > 0 && z == 0) {
            for (int b = y - 1; b > -1; b--) {
                System.out.println(x + "-" + b + "-" + z);
            }

            for (int a = x - 1; a > 0; a--) {
                if (a > y) {
                    System.out.println(a + "-" + y + "-" + z);
                } else {
                    System.out.println(a + "-" + a + "-" + z);
                }
            }


        }else{
            for(int a = x-1; a> 0; a--){
                System.out.println(a + "-" + y + "-" + z);
            }
        }
        if (x == 1 && y == 0 && z == 0) {
            System.out.println("Losing Board!");
        }
        if (x == 1 && y == 1 && z == 0){
            System.out.println("Winning Board!");
        }
    }



            //if(a>=b && a>=c && b>=c){
            //System.out.println(a + "-" + b + "-" + c);
            //}



        //add your code to return the row and the column of the chip you want to take.
        //you'll be returning a data type called Point which consists of two integers.

        public Point move (Chip[][]pBoard){


            gameBoard = pBoard;
            int column = 0;
            int row = 0;

            row = 1;
            column = 1;

            Point myMove = new Point(row, column);


            return myMove;
        }

}








