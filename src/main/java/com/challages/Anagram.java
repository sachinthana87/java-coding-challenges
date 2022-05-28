package com.challages;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Anagram {
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        String str1 = "abab";
        String str2 = "bbaa";
        System.out.println(checkIsAnagram(str1, str2));
    }

    private static void populateCharacterMap(String str, Map<String, Integer> map){
        int length = str.length();
        for (int i = 0; i < length; i++) {
            String character = str.substring(i, i + 1);
            if(map.containsKey(character)) map.put(character, map.get(character) + 1);
            else map.put(character, 1);
        }
    }
    private static boolean checkIsAnagram(String str1, String str2) {
        boolean result = false;
        Map<String, Integer> mapOne = new HashMap<>();
        Map<String, Integer> mapTwo = new HashMap<>();
        populateCharacterMap(str1, mapOne);
        populateCharacterMap(str2, mapTwo);
        result = mapOne.equals(mapTwo);
        return result;
    }
}
