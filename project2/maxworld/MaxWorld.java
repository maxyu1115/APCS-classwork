/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maxworld;

/**
 *
 * @author TheWanderingPath
 */
public class MaxWorld {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int dayCount=1;
        Area MaxDom= new Area("MaxDom", 100,1000);
        Area MinDom= new Area("MinDom", 100,1000);
        
        Area[] A=new Area[2];
        A[0]=MaxDom;
        A[1]=MinDom;
        
        while (MaxDom.getPopulation()+MinDom.getPopulation()>10 && dayCount < 30){
            System.out.println("Day "+dayCount);
            
            dayCount++;
        }
        
        System.out.println(NaturalEvent.getProbability(MaxDom));
        
        
        
    }
    
}
