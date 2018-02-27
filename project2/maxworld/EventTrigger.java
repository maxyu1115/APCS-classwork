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
public class EventTrigger {
    
    public Area area;
    
    public void ifHappen(){
        if (earthQuake()==1){
            EventEarthquake EQ=new EventEarthquake(area);
        }
    }
    
    private int earthQuake(){
        int probability=(int)(EventEarthquake.getProbability(area)*1000);
        if((int)(Math.random()*1000)<=probability){
            return 1;
        }
        return 0;
    }
}
