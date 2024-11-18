import java.awt.*;

// class Run1 is a tester-applet for the Die class
public class Run1 extends RunAbstract {
    protected Die myDie;

    public static void main(String[] args) {
        new Run1().setVisible(true);
    }
    
    /* Run1 Constructor */
    public Run1() {
        super();
    }

    /* 
     * display()
     * 
     * parameters: g - Graphics object
     * return: void
     * 
     * displays the entire project to the screen.
     * calls paint() on myDie to display the die on the screen
     */
    @Override
    public void display(Graphics g) {
        super.display(g);
        myDie.paint(g); // paint the first die
    }

    /* 
     * processRollButton()
     * 
     * parameters: N/A
     * return: void
     * 
     * when the roll button is clicked, the roll() method
     * is called on our myDie object to change the number
     * displayed on screen. 
     */
    @Override
    protected void processRollButton() {
        myDie.roll(canvas.getGraphics()); // reroll first die
    }

   /* 
    * addDice()
    * 
    * parameters: N/A
    * return: void
    * 
    * creates a new Die object by initializing it
    */
    @Override
    protected void addDice() {
        // create the die
        myDie = new Die();
    }
}