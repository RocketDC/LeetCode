package com.wissen.questions;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GroupAnagrams {
    public static void main(String[] args) {
        System.out.println(groupAnagrams(new String[]{"a"}));
    }
    public static List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>();
        List<String> anagrams = new ArrayList<>();

        for (String str : strs) {
            String sortedString = sortString(str);
            if (!anagrams.contains(sortedString)) {
                anagrams.add(sortedString);
                result.add(new ArrayList<>());
            }
            int index = anagrams.indexOf(sortedString);
            result.get(index).add(str);
        }
        return result;
    }

    public static String sortString(String str){
        char [] chars =  str.toCharArray();
        Arrays.sort(chars);
        return new String(chars);

    }
}
