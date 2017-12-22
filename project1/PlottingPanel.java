/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package max2048;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author TheWanderingPath
 */
public class PlottingPanel extends JPanel implements KeyListener{
    final int BOT = 500;
    final int TOP = 0;
    final int HEIGHT = 600;
    final int LEFT = 0;
    final int RIGHT = 500;
    final int MIDCOLUMN = 60; //the screen coordinates for
    final int MIDROW = 250;    //the origin

    // view attributes
    private final static int IMAGE_SIZE = 500,
            SCALE = 30,
            DIAMETER = 8;
    private final static int gridSize=4;

    //changes made by button presses 
    private int[] delta = {-1, 1, 1, -1};

    //point colors
    private Color[] colorChoice = {Color.ORANGE, Color.YELLOW, Color.MAGENTA, 
        Color.MAGENTA, Color.RED, Color.BLACK, Color.GREEN};
    
    private int grav=0;
    
    JLabel label;
    

    //constructor
    public PlottingPanel() {
        //A layout controls where pieces are put in a panel
        //This says the Plotting Panel will have a BorderLayout
        setLayout(new BorderLayout(500,600));
        
        
        addKeyListener(this);
        //setSize(1, 1);
        //setVisible(true);

        //Create a listener that will respond to buttons.


        //Tell the buttons what Listener will control what they
        //do when the button is pressed.
        
    }
    public void addNotify() {
        super.addNotify();
        requestFocus();
    }

    @Override
    public void keyPressed(KeyEvent e) { 
        int Key = e.getKeyCode();
        System.out.println("Hi");
        repaint();
    }
    @Override
    public void keyReleased(KeyEvent e) { 
    }
    @Override
    public void keyTyped(KeyEvent e) { 
    }
    
    //What should be drawn each time this panel is drawn.
    @Override
    public void paintComponent(Graphics g) {

        //white background for drawing
        g.setColor(Color.white);
        g.fillRect(0, 0, 500, 500);
        /*

        for (int i = 0, x=0; i < gridSize; i ++) {
            x=SCALE/2+DIAMETER/2+i*SCALE; //converts matrix coordinates to screen coordinates
            for (int j = 0, y=0; j < gridSize; j ++) {
                y=SCALE/2+DIAMETER/2+j*SCALE;
                
                g.setColor(colorChoice[ Max2048.mat[i][j] +1 ]);
                g.fillRect(x, y, 30, 30);
                g.setColor(Color.BLACK);
                g.drawRect(x, y, 30, 30);
            }
        }

        //Plot the control points
        g.setColor(Color.RED);
        g.fillOval((cP[0]+1)*SCALE,
                (cP[1]+1)*SCALE,
                DIAMETER, DIAMETER);
*/
        //draw the curve 
    }  //end paintComponent

    
    //*** A listener for buttons
    //This is a class within a class, 
    //so it has access to the private class data.
    //Any time a button is pressed, this will be called.

        /*public void actionPerformed(ActionEvent event) {
            //change control point value
            for (int i = 0; i < 4; i++) {
                if (event.getSource() == moveButton[i]) {
                    
                    
                        System.out.println("CLEAR!");
                        JFrame mess = new JFrame();
                        JOptionPane.showMessageDialog(mess, "CLEAR!! CONGRATS!!!");
                        System.exit(1000);

                    }

                
            }

            repaint(); //to repaint with the changes
        }*/

    
}
