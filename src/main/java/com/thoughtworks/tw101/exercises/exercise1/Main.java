package com.thoughtworks.tw101.exercises.exercise1;

// Exercise #1: Print all odd numbers from 1 to 100 and their sum.

public class Main {
    public static void main(String[] args) {
        int sumOf1To100 = 0;
        System.out.println("Odd numbers from 1 to 100:");
        for (int i = 1; i < 100; i = i+2) {
            sumOf1To100 = sumOf1To100 + i;
            System.out.println(i);
        }
        System.out.println("Sum of all odd numbers from 1 to 100: " + sumOf1To100);
    }
}
