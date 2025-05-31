package com.wissen.questions;

/**
 * Problem: Mirror Personality Fight
 * 
 * N people live in a town. The houses are arranged in a row. 
 * The personality of each owner is represented by a lowercase English character. 
 * Each person is in a fight with all those people who have a mirror personality to the one in the fight.
 * 
 * 'a' is a mirror of 'z' and vice versa
 * 'b' is a mirror of 'y' and vice versa
 * and so on...
 * 
 * Example:
 * Input: "abcz"
 * Output: 2
 * Explanation: 'a' fights with 'z', and 'b' fights with 'y'
 */
public class MirrorPersonalityFight {
    
    /**
     * Implement this method to solve the Mirror Personality Fight problem
     * 
     * Problem: Calculate the total number of fights in the town
     * Given a string representing personalities of people in the town,
     * return the total number of fights where each person fights with
     * all those who have a mirror personality.
     * 
     * @param personalities String representing personalities of people in the town
     * @return Total number of fights
     */
    public long calculateFights(String personalities) {
        int[]  persons = new int[26];
        for (int i = 0; i < personalities.length(); i++) {
            ++persons[personalities.charAt(i) - 'a'];
        }
        long count = 0;
        for (int i = 0; i < persons.length/2; i++) {

            int fights = persons[i] * persons[persons.length - i - 1];
            count += fights;
        }
        return count;
    }
}
