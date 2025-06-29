package com.wissen.questions;

public class CanPlaceFlowers {

    public static void main(String[] args) {
        int [] flowerbed = {0,0,1,0,0};
        int n = 2;
        System.out.println("Can place flower => "+ canPlaceFlowers(flowerbed,n));
    }
    public static boolean canPlaceFlowers(int [] flowerbed, int n){
        for (int i = 0; i < flowerbed.length; i++) {
            if((i-1<0 || flowerbed[i-1] == 0)&& (i+1 == flowerbed.length || flowerbed[i+1] ==0) && (flowerbed[i] == 0)){
                flowerbed[i] =1;
                n--;
            }


        }

        return n<=0;



    }
}
