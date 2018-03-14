/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author TheWanderingPath
 */
public class Rectangle extends Shapes {
    private int a,b;
    
    
    public Rectangle(int c, int d){
        a=c;
        b=d;
    }
    
    @Override
    public double area(){
        return a*b;
    }
    
    @Override 
    public double circumference(){
        return (a+b)*2;
    }
    

}
