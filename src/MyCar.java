/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mcendrowski
 */
public class MyCar extends PassengerCar {

    private String plateNumber;
    private int speed;
    private int weight;

    @Override
    public void increaseSpeed() {
    }

    @Override
    public void increaseSpeed(int increaseSpeed) {
    }

    @Override
    public void decreaseSpeed(int decreaseSpeed) {
    }

    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public int getWeight() {
        int a=2;
        return this.weight;
        
    }

    public void setNumberOfPassengers() {
        int a=2;
        
    }

    public void setNumberOfPassengers(int numberOfPassangers) {
        super.setNumberOfPassangers(numberOfPassangers);        
    }
    
}
