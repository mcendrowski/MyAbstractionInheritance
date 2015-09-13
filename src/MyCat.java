/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MCENDROWSKI
 */
public class MyCat implements Cat {

    public MyCat() {
        numberOfMyCats++;
    }
    private String name;
    private static int numberOfMyCats;
    private String breed;
    private int position;
    private int lungsVolume;
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getBreed() {
        return this.breed;
    }

    @Override
    public void setBreed(String breed) {
       this.breed=breed;
    }

    @Override
    public void breathe() {
        System.out.println("I breathe.");
    }

    @Override
    public void consume() {
        System.out.println("I eat.");
    }

    @Override
    public void move(int distance) {
        this.position+=distance;
    }

    // why does it not need overriding???
    public int getLungsVolume(){
        return this.lungsVolume;
    }
    
    // why does it not need overriding???
    public void setLungsVolume(int lungsVolume){
        this.lungsVolume=lungsVolume;
    }
}
