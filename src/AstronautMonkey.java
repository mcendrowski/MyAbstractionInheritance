/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mcendrowski
 */
public class AstronautMonkey extends Monkey implements MovieCharacter,Drawing {

    @Override
    public void run() {
     
    }

    @Override
    public void sleep() {
       
    }

    @Override
    public String sing() {
       return "La la la.";
    }

    @Override
    public String act() {
     return "I am an AstronautMonkey.";
    }

    @Override
    public String draw() {
      return "picture of a rocket.";
    }

    @Override
    public String useColor() {
      return "I prefer blue color.";
    }
    
}
