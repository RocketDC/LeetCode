package com.wissen.questions;

import java.util.HashMap;
import java.util.Map;

public class WordPattern {
    public static void main(String[] args) {
        System.out.println(wordPattern("abba","dog cat cat fish"));
    }

    public static boolean wordPattern(String pattern, String s) {
        String [] strs = s.split("\\s");
        char [] chars = pattern.toCharArray();
        if(pattern.length() != strs.length) return false;

        Map<Character,String> map = new HashMap<>();

        for(int i=0;i<strs.length;i++){
            if(map.containsKey(chars[i])){
                if(!strs[i].equals(map.get(chars[i])))
                    return false;
            }
            map.put(chars[i],strs[i]);
        }
        return true;
    }
}
