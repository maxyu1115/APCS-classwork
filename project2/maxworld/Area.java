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
public class Area {
    private int population;
    
    private int gdpTotal;
    private int[] gdpRatio={1,0,0,0,0};   //agriculture, sci+edu, industry, trade, national defense
    
    private String name;
    
    public Area(String n, int p, int gT){
        name=n;
        population=p;
        gdpTotal=gT;
    }
    
    public void setGDPRatio(int a, int b, int c, int d, int e){
        gdpRatio[0]=a;
        gdpRatio[1]=b;
        gdpRatio[2]=c;
        gdpRatio[3]=d;
        gdpRatio[4]=e;
    }
    
    public int getPopulation(){
        return population;
    }
    
    public void setPopulation(int newP){
        population=newP;
    }
    
    public int getGDP(){
        return gdpTotal;
    }
    
    public void setGDP(int newGDP){
        gdpTotal=newGDP;
    }
}
