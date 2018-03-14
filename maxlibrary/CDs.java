/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author TheWanderingPath
 */
public class CDs extends LibraryItem{
    private String genre;
    
    public CDs(String tit, String aut, String libNum, boolean onloan, int today, String gen){
        super(tit, aut, libNum, onloan, today);
        genre=gen;
    }
    
    public String getRequested(){
        return genre;
    }
    
    public void setRequested(String gen){
        genre=gen;
    }
    
    @Override
    public void printDetails(){
        super.printDetails();
        System.out.println(" Genre is: "+genre);
    }
}
