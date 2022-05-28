package com.challages.leetcode;

public class IsPalindrome {
    public static void main(String[] args) {
        int x = 12344321;
        System.out.println(isPalindrome(x));
    }

//    public static boolean isPalindrome(int x) {
//        boolean result = true;
//        char[] arr = String.valueOf(x).toCharArray();
//        for (int i = 0; i < arr.length / 2; i++) {
//            if(arr[i] != arr[arr.length - 1 - i]) result = false;
//        }
//        return result;
//    }


//    public static boolean isPalindrome(int x) {
//        boolean result = true;
//        String str = String.valueOf(x);
//        for (int i = 0; i < str.length() / 2; i++) {
//            if(str.charAt(i) != str.charAt(str.length() - 1 - i)) result = false;
//        }
//        return result;
//    }

//    public static boolean isPalindrome(int x) {
//        if(x < 0) return false;
//        int temp = x;
//        StringBuilder reverse = new StringBuilder();
//        int remainder = 0;
//        do {
//            remainder = temp % 10;
//            reverse.append(remainder);
//            temp  = temp / 10;
//        } while (temp > 0);
//
//        try {
//            if (Integer.valueOf(reverse.toString()) == x) return true;
//        }catch (NumberFormatException ex) {
//
//        }
//        return false;
//    }

//    public static boolean isPalindrome(int x) {
//        if(x < 0 || ( x % 10 == 0 && x != 0)) return false;
//        int temp = x;
//        int reverse = 0;
//        int remainder = 0;
//        do {
//            remainder = temp % 10;
//            reverse = reverse * 10 + remainder;
//            temp  = temp / 10;
//        } while (reverse < x);
//
//        if (reverse == x) return true;
//        return false;
//    }

    public static boolean isPalindrome(int x) {
        if(x < 0 || ( x % 10 == 0 && x != 0)) return false;
        int reverse = 0;
        do {
            reverse = reverse * 10 + x % 10;
            x /= 10;
        } while (reverse < x);

        if (reverse == x || x == reverse / 10) return true;
        return false;
    }
}
