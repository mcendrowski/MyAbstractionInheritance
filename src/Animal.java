/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MCENDROWSKI
 */
public interface Animal {

//    private int lengthtOfLife;
//    private int weight;

    public abstract void breathe();

    public abstract void consume();

    public abstract void move(int distance);

//    public int getWeight() {
//        return this.weight;
//    }
}
