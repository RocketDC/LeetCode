package com.wissen.questions;

public class FindHighestAltitude {

    public static void main(String[] args) {
        int[] gain = {-5, 1, 5, 0, -7};
        System.out.println(largestAltitude(gain));

    }


    public static int largestAltitude(int[] gain) {
        int maxAltitude = 0;
        int currAltitude=0;
        for (int i = 0; i < gain.length; i++) {
            currAltitude +=gain[i];
            maxAltitude = Math.max(maxAltitude,currAltitude);
        }
        return maxAltitude;
    }
}
