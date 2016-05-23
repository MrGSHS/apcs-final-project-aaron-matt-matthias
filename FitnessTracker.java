package finalproject;

import java.awt.*;
import java.awt.event.*;
import java.applet.Applet;
import javax.swing.*;

public class FitnessTracker extends JPanel implements ActionListener, MouseListener
{
    private int w, h;
    private int x = -100;
    private int y = -100;
    private int level;

    public FitnessTracker()
    {
        setPreferredSize(new Dimension(1000, 800));
        setBackground(ColorLibrary.lightGray());
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
        x = me.getX();
        y = me.getY();

        if(level == 0)
        {
            // Checks to see if user presses "New Profile" button
            if(x >= 300 && x <= 700 && y >= 400 && y <= 500)
            {
                level = 1;
                x = -100;
                y = -100;
            }

            // Checks to see if user presses "Choose Profile" button
            if(x >= 300 && x <= 700 && y >= 550 && y <= 650)
            {
                level = 2;
                x = -100;
                y = -100;
            }
        }
        else if(level == 1)
        {
            // Checks to see if user presses "Return" button
            if(x >= 20 && x <= 80 && y >= 20 && y <= 80)
            {
                // Redirects user to level 0 (main screen)
                level = 0;
            }
        }
        else if(level == 2)
        {
            // Checks to see if user presses "Return" button
            if(x >= 20 && x <= 80 && y >= 20 && y <= 80)
            {
                // Redirects user to level 0 (main screen)
                level = 0;
            }
        }
        else if(level == 3)
        {
            // Checks to see if user presses "Return" button
            if(x >= 20 && x <= 80 && y >= 20 && y <= 80)
            {
                // Redirects user to the previous level
                level--;
            }
        }
        else if(level == 4)
        {
            // Checks to see if user presses "Return" button
            if(x >= 20 && x <= 80 && y >= 20 && y <= 80)
            {
                // Redirects user to the previous level
                level--;
            }
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

    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);

        // Calculates window width and height
        w = getWidth();
        h = getHeight();

        if(level == 0)
        {
            // Title text
            g.setColor(Color.BLACK);
            String title = "Fitness Tracker";
            Font titleText = new Font("SansSerif", Font.BOLD, 100);
            g.setFont(titleText);
            FontMetrics titleMetrics = g.getFontMetrics();
            int titleX = (1000 - titleMetrics.stringWidth(title)) / 2;
            g.drawString(title, titleX, 200);

            // Font for new profile/choose profile button text
            Font buttonText = new Font("SansSerif", Font.PLAIN, 50);
            g.setFont(buttonText);
            FontMetrics buttonMetrics = g.getFontMetrics();

            // New profile button
            g.setColor(ColorLibrary.lightBlue());
            g.fillRect(300, 400, 400, 100);

            // New profile button text
            g.setColor(Color.BLACK);
            String newProfile = "New Profile";
            int newProfileX = (1000 - buttonMetrics.stringWidth(newProfile)) / 2;
            g.drawString(newProfile, newProfileX, 470);

            // Choose profile button
            g.setColor(ColorLibrary.lightBlue());
            g.fillRect(300, 550, 400, 100);

            // Choose profile button text
            g.setColor(Color.BLACK);
            String chooseProfile = "Choose Profile";
            g.setFont(buttonText);
            int chooseProfileX = (1000 - buttonMetrics.stringWidth(chooseProfile)) / 2;
            g.drawString(chooseProfile, chooseProfileX, 620);

            // Creator text
            g.setColor(Color.BLACK);
            String creators = "Created by A-A ron, Matt, Steven, and Matthias";
            Font creatorText = new Font("SansSerif", Font.PLAIN, 20);
            g.setFont(creatorText);
            FontMetrics creatorMetrics = g.getFontMetrics();
            int creatorsX = (1000 - creatorMetrics.stringWidth(creators)) / 2;
            g.drawString(creators, creatorsX, 750);

            // Creator text (date)
            String date = "@2016";
            FontMetrics dateMetrics = g.getFontMetrics();
            int dateX = (1000 - dateMetrics.stringWidth(date)) / 2;
            g.drawString(date, dateX, 775);
        }
        else if(level == 1)
        {
            // Return button
            returnButton(g);

            // Title text
            g.setColor(Color.BLACK);
            String title = "Create Profile";
            Font titleText = new Font("SansSerif", Font.BOLD, 100);
            g.setFont(titleText);
            FontMetrics titleMetrics = g.getFontMetrics();
            int titleX = (1000 - titleMetrics.stringWidth(title)) / 2;
            g.drawString(title, titleX, 200);
        }
        else if(level == 2)
        {
            // Return button
            returnButton(g);

            // Title text
            g.setColor(Color.BLACK);
            String title = "Profile List";
            Font titleText = new Font("SansSerif", Font.BOLD, 100);
            g.setFont(titleText);
            FontMetrics titleMetrics = g.getFontMetrics();
            int titleX = (1000 - titleMetrics.stringWidth(title)) / 2;
            g.drawString(title, titleX, 200);
        }
        else if(level == 3)
        {
            // Return button
            returnButton(g);

            // Title text
            g.setColor(Color.BLACK);
            String title = "Access Log";
            Font titleText = new Font("SansSerif", Font.BOLD, 100);
            g.setFont(titleText);
            FontMetrics titleMetrics = g.getFontMetrics();
            int titleX = (1000 - titleMetrics.stringWidth(title)) / 2;
            g.drawString(title, titleX, 200);
        }
        else if(level == 4)
        {
            // Return button
            returnButton(g);
        }
    }

    // Return button
    public void returnButton(Graphics g)
    {
        // Box
        g.setColor(ColorLibrary.lightBlue());
        g.fillRect(20, 20, 60, 60);

        // Arrow
        g.setColor(ColorLibrary.lightGray());
        g.fillRect(50, 40, 20, 20);

        Polygon arrowhead = new Polygon();
        arrowhead.addPoint(30, 50);
        arrowhead.addPoint(50, 30);
        arrowhead.addPoint(50, 70);
        g.fillPolygon(arrowhead);

        // Back text
        g.setColor(Color.BLACK);
        String back = "Go back";
        Font backText = new Font("SansSerif", Font.BOLD, 20);
        g.setFont(backText);
        FontMetrics backMetrics = g.getFontMetrics();
        int backX = (100 - backMetrics.stringWidth(back)) / 2;
        g.drawString(back, backX, 100);
    }
}