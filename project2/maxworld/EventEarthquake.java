/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.public EventEarthquake(Area A){
        area=A;
    }
 */
package maxworld;

/**
 *
 * @author TheWanderingPath
 */
public class EventEarthquake extends NaturalEvent{
        
    private double EQpDamageC=0.95;
    private double EQgdpDamageC=0.8;
    
    
    public EventEarthquake(Area A){
        area=A;
    }
    
    @Override
    public void effect(){
        int tempP=area.getPopulation();
        tempP=(int)(tempP*EQpDamageC);
        area.setPopulation(tempP);
        
        int tempG=area.getGDP();
        tempG=(int)(tempG*EQgdpDamageC);
        area.setPopulation(tempG);
    }
    
    @Override
    public void sacrifice(int cultNum){
        prob=cultNum*0.001;
    }
    
    public static double getProbability(Area A){
        return 0.1;
    }
    
    
}
