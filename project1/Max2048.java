/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package max2048;

import javax.swing.*;

/**
 *
 * @author TheWanderingPath
 */
public class Max2048 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        PlottingPanel jPanel=new PlottingPanel();
        JFrame application = new JFrame("Maze");
        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        application.getContentPane().add(jPanel);
        application.setSize(500, 600);  //width, height
        application.setVisible(true);
    }
    
}
