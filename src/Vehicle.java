/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mcendrowski
 */
public interface Vehicle {

    public abstract int getWeight();

    public abstract void setWeight(int weight);

    public abstract int getSpeed();

    public abstract void setSpeed(int speed);

    public abstract void increaseSpeed(int increaseSpeed);

    public abstract void decreaseSpeed(int decreaseSpeed);
}
