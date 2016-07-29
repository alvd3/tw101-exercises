package com.thoughtworks.tw101.exercises.exercise7;

import java.util.Scanner;

/**
 * Created by arickdavis on 7/29/16.
 */
public class UserGuess {

    public int TakeUserGuess() {
        Scanner reader = new Scanner(System.in);  // Reading from System.in
        System.out.println("Enter a number: ");
        int userGuess = reader.nextInt(); // Scans the next token of the input as an int.
        return userGuess;
    }
}
