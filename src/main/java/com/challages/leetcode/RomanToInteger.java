package com.challages.leetcode;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
    public static void main(String[] args) {
        String roman = "XXIV";
        System.out.println(romanToInt(roman));
    }


//    public static int romanToInt(String s) {
//        int value = 0;
//        Map<Character, Integer>  charMap = new HashMap<>();
//        charMap.put('I', 1);
//        charMap.put('V', 5);
//        charMap.put('X', 10);
//        charMap.put('L', 50);
//        charMap.put('C', 100);
//        charMap.put('D', 500);
//        charMap.put('M', 1000);
//
//        char[] charArray = s.toCharArray();
//        for (int i = 0; i < charArray.length; i++) {
//            if(i < charArray.length - 1) {
//                if (charMap.get(charArray[i]) < charMap.get(charArray[i + 1])) {
//                    value -= charMap.get(charArray[i]);
//                }else {
//                    value += charMap.get(charArray[i]);
//                }
//            }else {
//                value += charMap.get(charArray[i]);
//            }
//        }
//        return value;
//    }

    public static int romanToInt(String s) {
        int value = 0;
        Map<Character, Integer>  charMap = new HashMap<>();
        charMap.put('I', 1);
        charMap.put('V', 5);
        charMap.put('X', 10);
        charMap.put('L', 50);
        charMap.put('C', 100);
        charMap.put('D', 500);
        charMap.put('M', 1000);

        char[] charArray = s.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            if(i < charArray.length - 1) {
                if (charMap.get(charArray[i]) < charMap.get(charArray[i + 1])) {
                    value -= charMap.get(charArray[i]);
                }else {
                    value += charMap.get(charArray[i]);
                }
            }else {
                value += charMap.get(charArray[i]);
            }
        }
        return value;
    }
}
