/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author TheWanderingPath
 */
public class Triangle extends Shapes{
    private int a,b,c;
    
    public Triangle(int a, int b, int c){
        this.a=a;
        this.b=b;
        this.c=c;
    }
    
    @Override
    public double area(){
        double s=a+b+c/2;
        return Math.sqrt(s*(s-a)*(s-b)*(s-c));
    }
    
    @Override 
    public double circumference(){
        return a+b+c;
    }
    
}
