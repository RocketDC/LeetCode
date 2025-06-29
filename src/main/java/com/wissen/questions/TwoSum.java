package com.wissen.questions;

import java.util.HashMap;
import java.util.Map;

/**
 * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 * You can return the answer in any order.
 *
 * Example:
 * Input: nums = [2,7,11,15], target = 9
 * Output: [0,1]
 */
public class TwoSum {
    /**
     * Implement this method to solve the Two Sum problem
     * @param nums Array of integers
     * @param target Target sum
     * @return Array containing indices of two numbers that add up to target
     */
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<>() ;
        for(int i = 0;i< nums.length;i++){
            if(map.containsKey(target - nums[i])){
                return new int[]{map.get(target - nums[i]),i};
            }
            map.put(nums[i],i);

        }
        throw new UnsupportedOperationException("Not implemented yet");
    }
}
