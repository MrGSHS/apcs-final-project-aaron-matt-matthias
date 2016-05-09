import java.awt.*;
import java.awt.event.*;
import java.applet.Applet;
import javax.swing.*;

public class FitnessTracker extends Applet implements ActionListener, MouseListener
{
    private int w, h;
    private int xCoord = -100;
    private int yCoord = -100;
    private int level;
    
    public void init()
    {
        setBackground(Color.WHITE);
        addMouseListener(this);
        level = 0;
        
        /*
         * 0 = Main screen
         * 1 = Profile creator
         * 2 = Profile list
         * 3 = Access log creator
         * 4 = Access log display
         */
    }
    
    public void actionPerformed(ActionEvent ae)
    {
        repaint();
    }
    
    public void mousePressed(MouseEvent me)
    {
        // Calculates cursor coordiates when pressed
        xCoord = me.getX();
        yCoord = me.getY();
        
        if(level == 0)
        {
            
        }
        else if(level == 1)
        {
            
        }
        else if(level == 2)
        {
            
        }
        else if(level == 3)
        {
            
        }
        else if(level == 4)
        {
            
        }
        
        repaint();
    }
    
    public void mouseReleased(MouseEvent me)
    {

    }

    public void mouseClicked(MouseEvent me)
    {

    }

    public void mouseEntered(MouseEvent me)
    {

    }

    public void mouseExited(MouseEvent me)
    {

    }
    
    public void paint(Graphics g)
    {
        // Calculates window width and height
        w = getWidth();
        h = getHeight();
        
        // Applet only runs when the window is 1000px by 800px
        if(w == 1000 && h == 800)
        {
            
        }
    }
}