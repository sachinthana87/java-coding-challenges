package com.interviews.zalando;

public class ProblemTwo {
    public static void main(String[] args) {
        String s = "ababa";
        int[] c = {10,5,10,5,10};
        System.out.println(solution(s, c));
    }

    public static int solution(String S, int[] C) {
        int totalCost = 0;
        char prev = S.charAt(0);
        int maxCost = C[0];
        int curTotalCost = C[0];
        int length = S.length();

        for (int i = 1; i < length; i++) {
            char c = S.charAt(i);
            int curCost = C[i];
            if (c == prev) {
                maxCost = Math.max(maxCost, curCost);
                curTotalCost += curCost;
            } else {
                totalCost += curTotalCost - maxCost;
                prev = c;
                maxCost = curCost;
                curTotalCost = curCost;
            }
        }

        totalCost += curTotalCost - maxCost;
        return totalCost;
    }
}
