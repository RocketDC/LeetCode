package com.wissen.questions;

public class OneBlock {
    /**
     * You work in the resource-distribution team of your company.
     * A one-block is any contiguous block of data that contains exactly one resource whose value is 1.
     * 
     * You are given an array Arr of N integers representing resource values.
     * Task: Count the number of ways to divide Arr into contiguous blocks so that every block you create is a one-block.
     * 
     * Example 1:
     * 
     * Input: Arr = [1, 0, 1, 0, 1]
     * Output: 4
     * Explanation: There are 4 ways to divide the array into one-blocks:
     * 1. [1], [0, 1], [0, 1]
     * 2. [1], [0, 1, 0], [1]
     * 3. [1, 0], [1], [0, 1]
     * 4. [1, 0], [1, 0], [1]
     * 
     * Example 2:
     * 
     * Input: Arr = [1, 1, 1]
     * Output: 0
     * Explanation: It's impossible to divide the array into one-blocks since there are multiple 1s together.
     * 
     * Constraints:
     * 
     * 1 <= N <= 100
     * 0 <= Arr[i] <= 1
     */
    public int countOneBlocks(int[] arr) {
        int i = arr.length-1;
        for (; i >=0; i--) {
            if(arr[i] !=' ')
                break;
        }
        int zeros = 0;
        int lastOne =i;
        int start = i;
        for(;i>=0;i--){
            if(arr[i] == ' ')
                zeros++;
            if(arr[i] == '1')
                lastOne = i;
        }

        return 0;
    }
}
