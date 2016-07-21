package com.thoughtworks.tw101.exercises.exercise5;

public class Rectangle {
    private final int length;
    private final int width;
    int rectangleArea = 0;

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public int area(){
        rectangleArea = length*width;

        return rectangleArea;
    }
}
