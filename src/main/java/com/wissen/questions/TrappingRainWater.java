package com.wissen.questions;

public class TrappingRainWater {
    public static void main(String[] args) {
        System.out.println(trap(new int[]{
                4,2,0,3,2,5
        }));
    }

    public static int trap(int[] height) {
        int i = 0, j = height.length-1;
        int waterCollected = 0;
        int leftLongestHeight = 0;
        int rightLongestHeight= 0;
        while (i<j){
            if(height[i]>height[j]){
                if(rightLongestHeight> height[j]){
                    waterCollected += rightLongestHeight -height[j];
                }else {
                    rightLongestHeight = height[j];
                }
                j--;
            }
            else {
                if(leftLongestHeight >height[i]){
                    waterCollected +=leftLongestHeight - height[i];
                }
                else {
                    leftLongestHeight = height[i];
                }
                i++;
            }
        }

        return waterCollected;
    }

}
