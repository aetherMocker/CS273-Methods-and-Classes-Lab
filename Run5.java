import java.awt.*;
import javax.swing.*;

// class Run5 is a tester-applet for the Die class
public class Run5 extends Run4 {

    private JTextField minMsgField;
    private JTextField maxMsgField;
    private JTextField bothMsgField;
    private int minRoll;
    private int maxRoll;
    protected JTextField doublesMsgField;

    public static void main5() {
        new Run5().setVisible(true);
    }
    
    /* Run5 constructor */
    public Run5() {
        super();
    }

    /** addMessageFields()
     * 
     * adds the text fields that display its corresponding 
     * messages like minRoll and maxRoll, etc. to the screen
     * 
     * returns void
     */
    @Override
    protected void addMessageFields(Container c) {
        super.addMessageFields(c);
        minMsgField = createDefaultTextField();
        c.add(minMsgField);
        maxMsgField = createDefaultTextField();
        c.add(maxMsgField);
        bothMsgField = createDefaultTextField();
        c.add(bothMsgField);
        doublesMsgField = createDefaultTextField();
        c.add(doublesMsgField);
    }
    
    protected JTextField createDefaultTextField() {
        JTextField textField = new JTextField("", 25);
        textField.setBackground(Color.white);
        textField.setAlignmentX(Component.CENTER_ALIGNMENT);
        return textField;
    }

    // @Override
    // public void display(Graphics g) {
        // super.display(g);
        // myDie2.paint(g); // paint the second die
    // }
    
    /** updateMinMax()
     * 
     * calculates the minRoll and maxRoll after every roll
     * and updates the local variables that save those values
     * 
     * returns void
     */
    private void updateMinMax() {
        int sum = myDie.getCurrentValue() + myDie2.getCurrentValue();
        maxRoll = Math.max(maxRoll, sum);
        minRoll = Math.min(minRoll, sum);
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
        super.processRollButton();
        updateMinMax();
    }

    /** printMessages()
     * 
     * prints to the screen statistics about the minimum roll vs
     * the maximum roll that has been generated as a result of the
     * random rolls 
     * also prints when doubles are rolled
     * 
     * returns void
     */
    @Override
    protected void printMessages() {
        super.printMessages();
        minMsgField.setText("The minimum roll so far is " + minRoll);
        maxMsgField.setText("The maximum roll so far is " + maxRoll);
        bothMsgField.setText("The current die values are " + myDie + " and " + myDie2);
        
        if (myDie.equals(myDie2)) {
            doublesMsgField.setText("We have doubles");
        }
        else {
            doublesMsgField.setText("We don't have doubles");
        }
    }
    
    /** addDice()
     * 
     * initializes the dice to the screen, and sets the minRoll and 
     * maxRoll values
     * 
     * returns void
     */
    @Override
    protected void addDice() {
        super.addDice();
        minRoll = 1000;
        maxRoll = -1000;
        updateMinMax();
    }
}