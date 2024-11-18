import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Run3 extends Run2 {

    public static void main(String[] args) {
        new Run3().setVisible(true);
    }

    /* Run3 constructor */
    public Run3() {
        super();        
    }

    /* 
    * addDice()
    * 
    * parameters: N/A
    * return: void
    * 
    * creates a new Die object by initializing it
    * sets size to 150
    */
    @Override
    protected void addDice() {
        super.addDice();
        myDie.setSize(150);
    }

    
    @Override
    protected void handleButtonEvent(ActionEvent ae) { 
        if(ae.getSource() == increaseButton) { 
            myDie.setSize(myDie.getSize() + 10);
        }
        else if(ae.getSource() == decreaseButton) { 
            myDie.setSize(myDie.getSize() - 10);
        }        
        
        repaint();
    }    
}