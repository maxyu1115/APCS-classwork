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
            SCALE = 60,
            DIAMETER = 8;
    
    private final int gSize=Max2048.gridSize;

    //changes made by button presses 
    private int[] delta = {-1, 1, 1, -1};

    //point colors
    private Color[] colorChoice = {Color.WHITE, new Color(255,255,204), new Color(255,255,102), 
        new Color(255,255,0), new Color(255,204,153), new Color(255,153,51), new Color(255,128,0),
        new Color(255,153,153), new Color(255,102,102), new Color(255,51,51), new Color(255,0,0), 
        new Color(255,102,178), new Color(51,51,255), new Color(51,255,51)};
    
    private int grav=0;
    
    private Board2048 b=new Board2048();
    
    JLabel label;
    

    //constructor
    public PlottingPanel() {
        //A layout controls where pieces are put in a panel
        //This says the Plotting Panel will have a BorderLayout
        setLayout(new BorderLayout(500,600));
        
        Board2048 b=new Board2048();
        
        addKeyListener(this);
        //setSize(1, 1);
        //setVisible(true);
        


        
    }
    public void addNotify() {
        super.addNotify();
        requestFocus();
    }

    @Override
    public void keyPressed(KeyEvent e) { 
        int Key = e.getKeyCode();
        if (Key == KeyEvent.VK_RIGHT) {
            grav=1;
            System.out.println("Right key pressed");
        }else if (Key == KeyEvent.VK_UP) {
            grav=2;
            System.out.println("Up key pressed");
        }else if (Key == KeyEvent.VK_LEFT) {
            grav=3;
            System.out.println("left key pressed");
        }else if (Key == KeyEvent.VK_DOWN) {
            grav=4;
            System.out.println("Down key pressed");
        }
        b.gravApplier(grav);
        
        
        
        repaint();
        
        if (b.checkEnd()){
            System.out.println("CLEAR!");
            JFrame mess = new JFrame();
            JOptionPane.showMessageDialog(mess, "Game Over!");
            System.exit(1000);
        }
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
        

        for (int i = 0, y=0; i < gSize; i ++) {                
            y=SCALE/2+DIAMETER/2+i*SCALE;

            for (int j = 0, x=0; j < gSize; j ++) {
                            x=SCALE/2+DIAMETER/2+j*SCALE; //converts matrix coordinates to screen coordinates

                
                
                if (b.board[i][j]!=0){
                    g.setColor(colorChoice[b.board[i][j]]);
                    g.fillRect(x, y, SCALE, SCALE);
                    g.setColor(Color.BLACK);
                    g.drawString(""+(int)Math.pow(2,b.board[i][j]), x+SCALE/2, y+SCALE/2);
                }
                g.setColor(Color.BLACK);
                g.drawRect(x, y, SCALE, SCALE);
            }
        }

        //Plot the control points

        //draw the curve 
    }  //end paintComponent

    

    
}
