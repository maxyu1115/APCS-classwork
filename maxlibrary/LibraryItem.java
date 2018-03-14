
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author TheWanderingPath
 */
public class LibraryItem {
    
    private String title;
    private String author;
    private String libraryID;
    private boolean loanStatus;
    private int dateDue;
    
    public LibraryItem(String tit, String aut, String libNum, boolean onloan, int today){
        title=tit;
        author=aut;
        libraryID=libNum;
        loanStatus=onloan;
        dateDue=today+21;
    }
    
    public String getTitle(){
        return title;
    }
    
    public String getAuthor(){
        return author;
    }
    
    public String getID(){
        return libraryID;
    }
    
    public boolean getOnloan(){
        return loanStatus;
    }
    
    public int getDueDate(){
        if(loanStatus){
            return dateDue;
        }
        return -1;
    }
    
    public void borrowing(int today){
        if (!loanStatus){
            loanStatus=true;
            dateDue=today+21;
        }
    }
    
    public void returning(int today){
        if (loanStatus){
            loanStatus=false;
            if (dateDue<today){
                System.out.println("You're late, give Max $20");
            }
        }
    }
    
    public void printDetails(){
        System.out.println("title " + title +
" \n author " + author+
" \n libraryID " + libraryID+
" \n loanStatus " +loanStatus+
" \n dateDue "+dateDue);
    }
    
}
