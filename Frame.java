package finalproject;

import javax.swing.*;
import java.util.ArrayList;

/**
 * Write a description of class Frame here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Frame
{
    private static ArrayList<JPanel> panelList = new ArrayList<JPanel>();
    public static JFrame displayFrame;
    
    public static Profile userProfile;
    
    public static void main(String[] args)
    {
        displayFrame = new JFrame("Fitness Tracker");
        displayFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        panelList.add(new BasicInformation());
        panelList.add(new ActivitiesCaloriesBurned());
        panelList.add(new BodyFatPercentageCalculator());
        switchPanel(0);
        displayFrame.setVisible(true);
    }
    
    //0: BasicInformation
    //1: ActivitiesCaloriesBurned
    //2: BodyFatPercentageCalculator
    public static void switchPanel(int index)
    {
        displayFrame.setContentPane(panelList.get(index));
        
        if(panelList.get(index) instanceof Switchable)
            ((Switchable)(panelList.get(index))).onSwitch();
        
        displayFrame.pack();
    }
}
