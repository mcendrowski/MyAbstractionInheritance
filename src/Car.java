/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mcendrowski
 */
public interface Car extends Vehicle {

    public abstract int getNumberOfWheels();

    public abstract void setNumberOfWheels(int numberOfWheels);

    public abstract String getPlateNumber();

    public abstract void setPlateNumber(String plateNumber);

}
