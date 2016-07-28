package com.thoughtworks.tw101.exercises.exercise6;

/**
 * Created by arickdavis on 7/26/16.
 */
public class Monster {

    public void reportStatus(String name, int hitPoints){
        System.out.println(name + " " + hitPoints + "HP" );
    }

//    public void reportStatus(Monster[] monsters) {}


    public void takeDamage( Orc name, int hitDamage) {
        name.hitpoints = name.hitpoints - hitDamage;
    }

    public void takeDamage( Troll name, int hitDamage) {
        name.hitpoints = name.hitpoints - hitDamage/2;
    }


//    /**
//     * Created by arickdavis on 7/26/16.
//     */
//    public static class Orc extends Monster {
//        public int hitpoints = 20;
//
//    }
//
//    /**
//     * Created by arickdavis on 7/26/16.
//     */
//    public static class Troll extends Monster{
////        public int hitpoints = 40;
//    }
}
