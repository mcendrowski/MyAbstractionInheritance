/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mcendrowski
 */
public abstract class UnrealAnimal {
    private int speed;
    private int strength;
    public abstract void eat();
    public abstract void fight();

    public final int getSpeed() {
        return speed;
    }

    public final void setSpeed(int speed) {
        this.speed = speed;
    }

    public final int getStrength() {
        return strength;
    }

    public final void setStrength(int strength) {
        this.strength = strength;
    }
    
    
}
