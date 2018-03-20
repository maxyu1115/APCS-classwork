/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maxmergeable;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author TheWanderingPath
 */
public class IntegerSet implements Mergeable{
    
    private ArrayList<Integer> iSet;
    
    public IntegerSet(List<Integer> c){
        iSet = new ArrayList<Integer>(c);
    }
    
    public void printElements(){
        System.out.println(iSet.toString());
    }
    
    public int size(){
        return iSet.size();
    }
    
    public boolean elementOf(int x){
        return iSet.contains(new Integer(x));
    }
    
    @Override
    public Object merge(Object c){
        ArrayList<Integer> d=(ArrayList<Integer>)c;
        ArrayList<Integer> temp=new ArrayList<Integer>();
        temp.addAll(iSet);
        temp.addAll(d);
        return temp;
    }
    
    
    
}
