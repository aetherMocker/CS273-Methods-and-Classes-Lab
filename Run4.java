import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

// class Run4 is a tester-applet for the Die class
public class Run4 extends Run3 {
    protected Die myDie2; //makes a second die to display

    public static void main(String[] args) {
        new Run4().setVisible(true);
    }
    
    /* Run4 Constructor */
    public Run4() {
        super();
    }

    @Override
    public void display(Graphics g) {
        super.display(g);
        myDie.paint(g); // paint the first die
        myDie2.paint(g); // paint the second die
    }

    /** processRollButton()
     * 
     * handles the roll button action and calls the 
     * appropriate method to execute it
     * 
     * returns void
     */
    @Override
    protected void processRollButton() {
        myDie.roll(canvas.getGraphics()); // reroll first die
        myDie2.roll(canvas.getGraphics()); // reroll second die
    }

    @Override
    protected void handleButtonEvent(ActionEvent ae) { 
        super.handleButtonEvent(ae);
        if(ae.getSource() == increaseButton) { 
            myDie2.setSize(myDie2.getSize() + 10);
        }
        else if(ae.getSource() == decreaseButton) { 
            myDie2.setSize(myDie2.getSize() - 10);
        }        
        
        repaint();
    }   

    /** addDice()
     * 
     * initializes the dice to the screen, 
     * and sets their size and position
     * 
     * returns void
     */
    @Override
    protected void addDice() {
        myDie = new Die(0, 0); // first die is at (0,0)
        myDie.setSize(150);
        myDie2 = new Die(210, 50); //second die is at (210,50)
        myDie2.setSize(50);
    }
}