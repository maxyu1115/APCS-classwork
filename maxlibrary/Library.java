/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author TheWanderingPath
 */
public class Library {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LibraryItem b = new Books("12 Rules for Life", "Jordan Peterson", "X123", false, 13, false );
        b.printDetails();
        
        LibraryItem cd = new CDs("And Justice for all", "Metallica", "X567", false, 14, "Metal");
        cd.printDetails();
    }
    
}
