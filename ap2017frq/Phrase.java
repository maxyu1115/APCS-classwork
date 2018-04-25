/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author TheWanderingPath
 */
public class Phrase {
    private String currentPhrase;
    
    public Phrase(String phrase){
        currentPhrase=phrase;
    }
    
    public int findNthOccurrence(String str, int n){
        return 0;
    }
    
    public void replaceNthOccurrence(String str, int n, String repl){
        int i=findNthOccurrence(str,n);
        currentPhrase=currentPhrase.substring(i)+repl+currentPhrase.substring( i+str.length(), currentPhrase.length());
    }
    
    public int findLastOccurrence(String str){
        return currentPhrase.lastIndexOf(str);
    }
}
