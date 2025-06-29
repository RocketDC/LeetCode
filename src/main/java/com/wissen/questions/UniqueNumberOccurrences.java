package com.wissen.questions;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UniqueNumberOccurrences {

    public static void main(String[] args) {

    }

    public static boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        int [] repetitions = new int[map.size()];
        int i = 0;
        for(int val : map.values()){
            repetitions[i] = val;
            i++;
        }
        Arrays.sort(repetitions);

        for (int j = 0; j < repetitions.length -1; j++) {
            if(repetitions[j+1] - repetitions[j] == 0)
                return false;
        }
        return true;
    }
}
