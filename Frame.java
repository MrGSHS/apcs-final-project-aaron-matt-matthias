import javax.swing.*;

/**
 * Write a description of class Frame here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Frame
{
    public static void main(String[] args)
    {
        JFrame f = new JFrame("Fitness Tracker");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.getContentPane().add(new FitnessTracker());
        f.pack();
        f.setVisible(true);
    }
}
