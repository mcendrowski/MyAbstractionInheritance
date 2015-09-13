/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mcendrowski
 */
public class Shrek extends UnrealAnimal implements DonkeyFriend, Ogre {

    @Override
    public void fight() {
    }

    @Override
    public String play() {
        return "Let's play cards.";
    }

    @Override
    public String greet() {
        return "Hello Donkey.";
    }

    @Override
    public void eat() {
        System.out.println("I eat a lot.");
    }

    @Override
    public void actLikeOgre() {
        System.out.println("I am stubborn but nice.");
    }

}
