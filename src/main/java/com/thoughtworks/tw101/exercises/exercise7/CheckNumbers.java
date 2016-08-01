package com.thoughtworks.tw101.exercises.exercise7;

/**
 * Created by arickdavis on 7/29/16.
 */
public class CheckNumbers {

    public CheckNumbers RunCheck(int random, int guess){
        UserGuess userGuess = new UserGuess();
        while (guess != random) {
            if (guess > random) {
                System.out.println("guess is too high");
            } else {
                System.out.println("guess is to low");
            }
            guess = userGuess.TakeUserGuess();
        }
        System.out.println("you win");
        return null;
    }
}
