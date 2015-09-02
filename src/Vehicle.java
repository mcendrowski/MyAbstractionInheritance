/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mcendrowski
 */
public abstract class Vehicle {

    private int weight;
    private int speed;

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public abstract int getSpeed();

    public void setSpeed() {}

    

    public abstract void increaseSpeed();

    public abstract void decreaseSpeed(int decreaseSpeed);
}
