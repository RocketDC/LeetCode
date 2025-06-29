package com.wissen.questions;

public class ContainerWithMostWater {
    public static void main(String[] args) {
        System.out.println(maxArea(new int[]{1,8,6,2,5,4,8,3,7}));
    }

    public static int maxArea(int[] height) {
        int ans = 0;
        int left =0, right = height.length-1;

        while (left<right){

            if(height[left] < height[right]){
                ans = Math.max(height[left] * (right -left),ans);
                left++;
            }else {
                ans = Math.max(height[right] * (right -left),ans);
                right--;
            }
        }
        return ans;
    }

}
