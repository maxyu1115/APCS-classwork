/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maxmergeable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author TheWanderingPath
 */
public class MaxMergeable {

    
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        List<Integer> A =Arrays.asList(4,3,6);
        //ArrayList<Integer>A=new ArrayList<Integer>();
        //A.add(3);
        //A.add(5);
        
        IntegerSet I=new IntegerSet(A);
        
        I.printElements();
        
        

    }
    
}
