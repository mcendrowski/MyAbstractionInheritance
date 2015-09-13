/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MCENDROWSKI
 */
public abstract class MyCat implements Cat {

    public MyCat() {
        numberOfMyCats++;
    }
    private String name;
    private static int numberOfMyCats;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
