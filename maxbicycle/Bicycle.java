/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maxbicycle;

/**
 *
 * @author TheWanderingPath
 */
public class Bicycle {
    private double wheelRadius;
    private double gearRadius;
    private double humanPower;
    private double hitPoint;
    
    
    public Bicycle(double wR, double P, double HP){
        wheelRadius=wR;
        humanPower=P;
        hitPoint=HP;
    }
    
    public double speed(double humanMass){
        return humanPower/(humanMass*9.8)*gearRadius/wheelRadius;
    }
    
    public double rocketSystem(double money){
        double damage=money/100;
        return damage;
    }
    
    public double hurt(double damage){
        hitPoint-=damage;
        if (hitPoint<0)
            hitPoint=0;
        return hitPoint;
    }
    
    
}
