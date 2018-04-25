
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author TheWanderingPath
 */
public class Digits {
    private ArrayList<Integer> digitList;
    
    public Digits (int num) {
	ArrayList<Integer> tempList = new ArrayList<Integer>();
	int temp=0;
	while (num > 0) {
            temp=num%10;
            tempList.add( new Integer(temp) );
            num=num/10;
        }
        int len=tempList.size();
        for ( int i=len-1; len>=0; len--){
            digitList.add(tempList.get(i));
        }
    }
    
    public boolean isStrictlyIncreasing(){
        int len=digitList.size();
        for (int i=0;i<len-1;i++){
            if (digitList.get(i)>=digitList.get(i+1)){
                return false;
            }
        }
        return true;
    }
}
