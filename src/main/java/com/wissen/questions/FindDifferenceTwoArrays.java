package com.wissen.questions;

import java.util.*;

public class FindDifferenceTwoArrays {
    public static void main(String[] args) {
        System.out.println(findDifference(new int[]{1,2,3,3},new int[]{1,1,2,2}));
    }

    public static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        List<List<Integer>> result = new ArrayList<>();
        result.add(new ArrayList<>());
        result.add(new ArrayList<>());


        for (int j : nums1) {
            set1.add(j);
        }
        for (int j : nums2) {
            set2.add(j);
        }
        for (int j : set2){
            if(!set1.contains(j)){
               result.get(1).add(j);
            }
        }
        for (int j : set1){
            if(!set2.contains(j)){
                result.get(0).add(j);
            }
        }

        return result;

    }
}
