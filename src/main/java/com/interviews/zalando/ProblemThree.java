package com.interviews.zalando;

public class ProblemThree {
    public static void main(String[] args) {
        int[] c = {2, 3, 1, 5, 5, 7, 1, 3, 1};
        System.out.println(solution(c));
    }

    public static int solution(int[] A) {
        int ans = Integer.MAX_VALUE;
        int min = A[1];
        for (int i = 3; i < A.length - 1; i++) {
            min = Math.min(min, A[i - 2]);
            if (A[i] + min < ans) {
                ans = A[i] + min;
            }
        }
        return ans;
    }
}
