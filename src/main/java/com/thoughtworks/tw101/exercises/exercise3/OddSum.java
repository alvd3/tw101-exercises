package com.thoughtworks.tw101.exercises.exercise3;

public class OddSum {

    public int of(int start, int end) {
        int oddSum = 0;
        int startOdd = makeStartOdd(start);
        for (int i = startOdd; i <end ; i=i+2) {
            oddSum = oddSum + i;
        }
        return oddSum;
    }

    public int makeStartOdd(int start) {
        int startOdd = start;
        if (start%2 == 0){
            startOdd = start + 1;
        }
        return startOdd;
    }


}
