/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mcendrowski
 */
public class MyCar implements Car, NumberOfPassengers {

    private int numberOfPassengers;
    private String plateNumber;
    private int numberOfWheels;
    private int speed;
    private int weight;

    @Override
    public int getNumberOfPassengers() {
        return this.numberOfPassengers;
    }

    @Override
    public void setNumberOfPassengers(int numberOfPassengers) {
        this.numberOfPassengers = numberOfPassengers;
    }

    
    @Override
    public String getPlateNumber() {
        return this.plateNumber;
    }
    
    
    @Override
    public void setPlateNumber(String plateNumber){
        this.plateNumber=plateNumber;
    }
    
    
    @Override
    public int getNumberOfWheels(){
        return this.numberOfWheels;
    }
    
    
    @Override
    public void setNumberOfWheels(int numberOfWheels){
        this.numberOfWheels=numberOfWheels;
    }
    
    
    @Override
    public int getWeight(){
        return this.weight;
    }
    
    
    @Override
    public void setWeight(int weight){
        this.weight=weight;
    }    
   
    @Override
    public void increaseSpeed(int increaseSpeed){
        this.speed+=increaseSpeed;
    }
    
    @Override
     public void decreaseSpeed(int decreaseSpeed){
        this.speed-=decreaseSpeed;
    }   


    @Override
    public int getSpeed() {
        return this.speed;
    }

    @Override
    public void setSpeed(int speed) {
        this.speed=speed;
    }
}
