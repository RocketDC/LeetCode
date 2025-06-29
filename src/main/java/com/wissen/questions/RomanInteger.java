package com.wissen.questions;

import java.util.HashMap;
import java.util.Map;

public class RomanInteger {
    public static void main(String[] args) {
        System.out.println(romanToInt("MCMXCIV"));
    }
    public static int romanToInt(String s) {
        Map<Character, Integer> map =  new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        int number = 0;
        char lastChar = s.charAt(s.length() -1) ;
        number+= map.get(lastChar);
//        boolean isSubtracted = false;

        for (int i = s.length() - 2 ; i >= 0 ; i--) {
            char ch = s.charAt(i);
            if(map.get(ch)<map.get(lastChar)){
                number-=map.get(ch);
            }else {
                number+=map.get(ch);
            }
            lastChar = ch;

        }

        return number;
    }

}
