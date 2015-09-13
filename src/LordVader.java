/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mcendrowski
 */
public class LordVader implements StarWarsCharacter {

    private String mood;
    
    
    @Override
    public String sing() {
       return "Ola la";
    }

    
    @Override
    public String act() {
       return "I am dying.";
    }

    @Override
    public void flyInSpace() {
      System.out.println("I can fly.");
    }
    
    
    @Override
    public String getMood(){
        return this.mood;
    }
    
    
    @Override
    public void setMood(String mood){
        this.mood=mood;
    }

   
    
}
