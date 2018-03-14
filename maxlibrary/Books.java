/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author TheWanderingPath
 */
public class Books extends LibraryItem {
    
    private boolean isRequested;
    
    public Books(String tit, String aut, String libNum, boolean onloan, int today, boolean req){
        super(tit, aut, libNum, onloan, today);
        isRequested=req;
    }
    
    public boolean getRequested(){
        return isRequested;
    }
    
    public void setRequested(boolean req){
        isRequested=req;
    }
    
    @Override
    public void printDetails(){
        super.printDetails();
        System.out.println(" isRequested: "+isRequested);
    }

}
