/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mcendrowski
 */
public abstract class Car extends Vehicle {

    private int weight;
    private int speed;
    private int numberOfWheels;

    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public void setNumberOfWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }


    public abstract void increaseSpeed(int increaseSpeed);
    
    @Override
    public abstract void increaseSpeed();

}
