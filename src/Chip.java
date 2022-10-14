import java.awt.*;

public class Chip {
    //variables
    public int xpos;
    public int ypos;
    public int width;
    public int height;
    public boolean isAlive;
    public Rectangle rec;

    public Chip(int row, int col, int xOff, int yOff, int size){

        isAlive = true;
        xpos = col*size+xOff;
        ypos = (9-row)*size+yOff;
        rec = new Rectangle(xpos,ypos, size, size);
    }

}
