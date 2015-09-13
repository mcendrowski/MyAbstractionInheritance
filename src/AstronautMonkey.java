/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mcendrowski
 */
public class AstronautMonkey implements Monkey, MovieCharacter, Drawing {

    @Override
    public void run() {
    System.out.println("I am running very fast.");
    }

    @Override
    public void sleep() {
       System.out.println("I am a heavy sleeper");
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
