/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mcendrowski
 */
public class LordVader extends Character implements MovieCharacter, StarWarsCharacter {

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
      
    }
    
}
