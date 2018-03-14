
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author TheWanderingPath
 */
public class Circle extends Shapes implements Comparable {
    private int r;
    
    public Circle(int r){
        this.r=r;
    }
    
    public int radius(){
        return r;
    }
    
    @Override
    public double area(){
        return Math.PI*Math.pow(r,2);
    }
    
    @Override 
    public double circumference(){
        return Math.PI*r*2;
    }
    
    public String toString(){
        return "r="+ r;
    }
    
    public boolean equals(Circle c){
        return (this.circumference()==c.circumference());
    }
    
    @Override
    public int compareTo(Object c){
        Circle a=(Circle)c;
        return this.radius()-a.radius();
    }
    
    public static void main(String[] args){
        Circle c1=new Circle(1);
        Circle c2=new Circle(6);
        Circle c3=new Circle(3);
        
        List a=new ArrayList<Circle>();
        a.add(c1);
        a.add(c2);
        a.add(c3);
        
        Collections.sort(a);
        System.out.print(a);
        
    }
    
}
