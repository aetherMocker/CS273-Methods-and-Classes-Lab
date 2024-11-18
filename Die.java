import java.lang.Math;
import java.awt.*;

public class Die {
    
    /************* CHECKPOINT 1 **********/
    private int currentValue;
    private int size;
    private int xCoord;
    private int yCoord;


    //constructor
    public Die() {
        this.reRoll();
        this.setSize(50);
    }

    public Die(int x, int y) {
        this();
        this.xCoord = x;
        this.yCoord = y;
    }

    private void reRoll() {
        this.currentValue = (int)((Math.random())*6) + 1;
    }

    public void roll(Graphics g) {
        this.reRoll();
        this.paint(g);
    }

    public void paint(Graphics g) {
        /* if(g == null) {
            return;
        } */
        g.setColor(Color.BLACK);
        g.drawRect(xCoord, yCoord, size, size);
        g.setColor(Color.WHITE);
        g.fillRect(xCoord, yCoord, (size-2), (size-2));
        g.setColor(Color.BLACK);
        g.drawString(Integer.toString(currentValue), xCoord + size/2, yCoord + size/2);
        //calling drawSpot()
    }

    /************* CHECKPOINT 2 **********/
     // plus editting paint()

    public void drawSpot(Graphics g, int x, int y) {
        // insert the pips of the die faces...
    }

    /************* CHECKPOINT 3 **********/
    
    public void setSize(int _size) {
        this.size = _size;
    }

    public int getSize() {
        return this.size;
    }
    
     /************* CHECKPOINT 4 **********/

}