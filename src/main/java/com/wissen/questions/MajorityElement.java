package com.wissen.questions;
import java.util.Map;
import java.util.HashMap;

public class MajorityElement {
    /**
     * Given an array nums of size n, return the majority element.
     * 
     * The majority element is the element that appears more than ⌊n/2⌋ times. 
     * You may assume that the majority element always exists in the array.
     * 
     * Example 1:
     * 
     * Input: nums = [3,2,3]
     * Output: 3
     * Example 2:
     * 
     * Input: nums = [2,2,1,1,1,2,2]
     * Output: 2
     * 
     * Constraints:
     * 
     * n == nums.length
     * 1 <= n <= 5 * 104
     * -231 <= nums[i] <= 231 - 1
     * 
     * Follow-up: Could you solve the problem in linear time and in O(1) space?
     */
    public int majorityElement(int[] nums) {
        int maxNum =nums[0];
        int count=0;

        for (int num : nums) {
            if (count > nums.length/2)
                return maxNum;
            if (count <= 0)
                maxNum = num;

            if (num == maxNum)
                count++;
            else
                count--;
        }
        return maxNum;
    }
    public int method1 (int[] nums){
        Map<Integer,Integer> noOfElements = new HashMap<>();
        for (int num : nums) {
            noOfElements.put(num, noOfElements.getOrDefault(num, 0) +1);
            if (noOfElements.get(num) > nums.length / 2)
                return num;


        }
        return -1;
    }
}
