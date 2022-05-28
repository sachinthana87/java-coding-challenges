package com.interviews.zalando;

public class ProblemOne {
    public static void main(String[] args) {
        String s = "5";
        System.out.println(solution(s) + "");
    }

    public static int solution(String S) {
        int result = Integer.MIN_VALUE;
        int length = S.length();
        for (int i = 0; i < length - 1; i++) {
            int value = Integer.valueOf(S.substring(i, i + 2));
            if(value > result) result = value;
        }
        return result;
    }
}
