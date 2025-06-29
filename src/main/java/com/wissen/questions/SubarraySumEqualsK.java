package com.wissen.questions;

public class SubarraySumEqualsK {
    public static void main(String[] args) {
        System.out.println(subarraySum(new int[]{1}, 1));
    }

    public static int subarraySum(int[] nums, int k) {
        int ans = 0;
        int i = 0, j = 0;
        int currSum = 0;
        while (j < nums.length) {

            if (currSum == k) {
                ans++;
                currSum -= nums[i];
                i++;
            } else if (currSum > k) {
                currSum -= nums[i];
                i++;
            } else {
                currSum += nums[j];
                j++;
            }

        }
        while (i < nums.length) {
            if (currSum == k) {
                ans++;
                break;
            } else if (currSum > k) {
                currSum -= nums[i];

            }else {
                break;
            }
            i++;
        }
        return ans;
    }
}
