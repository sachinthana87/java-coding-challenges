package com.challages.leetcode;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] input = {"flower", "flow", "flight"};
        System.out.println(longestCommonPrefix(input));
    }

    // This is O(n-squared)
//    public static String longestCommonPrefix(String[] strs) {
//        StringBuilder prefix = new StringBuilder("");
//        int commonIndex = 0;
//        boolean hasCommonChar = true;
//        char commonChar = 'A';
//        while (hasCommonChar) {
//            for (int i = 0; i < strs.length; i++) {
//                if(strs[i].length() > commonIndex) {
//                    if(i == 0) commonChar = strs[i].charAt(commonIndex);
//
//                    if(commonChar != strs[i].charAt(commonIndex)) {
//                        hasCommonChar = false;
//                    }
//
//                }else break;
//
//                if(i == strs.length - 1) {
//                    if(hasCommonChar) {
//                        prefix.append(strs[i].charAt(commonIndex));
//                        commonIndex++;
//                    }
//                }
//            }
//        }
//        return prefix.toString();
//    }

//    public static String longestCommonPrefix(String[] strs) {
//        StringBuilder prefix = new StringBuilder("");
//        int minLength = Integer.MAX_VALUE;
//
//        for(String str : strs) {
//            if(str.length() < minLength) minLength = str.length();
//        }
//
//        for (int j = 0; j < minLength; j++) {
//            boolean hasCommonChar = true;
//            char commonChar = 'A';
//            for (int i = 0; i < strs.length; i++) {
//                if(i == 0) commonChar = strs[i].charAt(j);
//
//                if(commonChar != strs[i].charAt(j)) {
//                    hasCommonChar = false;
//                }
//            }
//
//
//            if(hasCommonChar && commonChar != 'A') {
//                prefix.append(commonChar);
//            }else break;
//        }
//
//        return prefix.toString();
//    }

    public static String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) return "";
        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++)
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) return "";
            }
        return prefix;
    }
}
