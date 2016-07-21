package com.thoughtworks.tw101.exercises.exercise5;

public class RectangleAverager {
    int totalArea = 0;


    public float averageArea(Rectangle[] rectangles) {
        for (int i = 0; i < rectangles.length; i++) {
            totalArea = totalArea +rectangles[i].area();
        }
        int averageArea = totalArea / rectangles.length;
        return averageArea;
    }
}
