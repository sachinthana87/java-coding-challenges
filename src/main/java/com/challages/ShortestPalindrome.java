package com.challages;

/**
 * Hello world!
 *
 */
public class ShortestPalindrome
{
    static boolean isPalindrome(String x) {
        boolean result = true;
        char[] arr = x.toCharArray();
        for (int i = 0; i < arr.length / 2; i++) {
            if(arr[i] != arr[arr.length - 1 - i]) result = false;
        }
        return result;
    }

    static String addChar(String str, char ch, int position) {
        return str.substring(0, position) + ch + str.substring(position);
    }
    static int shortestPalindrome(String s) {
        int result = 0;
        String originalStr = s;
        String tempStr = s;
        while (!isPalindrome(tempStr)) {
            for (int i = 0; i < originalStr.length(); i++) {
                tempStr = addChar(tempStr, originalStr.charAt(i), tempStr.length() - i);
                result++;
                if(isPalindrome(tempStr)) {
                    break;
                }
            }
        }
        return result;
    }

    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        String str = "abab";
        System.out.println(shortestPalindrome(str));
    }
}
