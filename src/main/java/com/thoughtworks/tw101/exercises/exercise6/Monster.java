package com.thoughtworks.tw101.exercises.exercise6;

/**
 * Created by arickdavis on 7/26/16.
 */
public class Monster {

    public void reportStatus(String name, int hitPoints){
        System.out.println(name + " " + hitPoints + "HP" );
    }

    public void takeDamage( Orcs name, int hitDamage) {name.hitpoints = name.hitpoints - hitDamage;}

    public void takeDamage( Trolls name, int hitDamage) {
        name.hitpoints = name.hitpoints - hitDamage/2;
    }

}
