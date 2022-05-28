package com.interviews.zalando;

public class CalculateSumOfIntsWithTwoDigits {
    public static void main(String[] args) {
        int[] arr1 = {1, 23, 4, 55, 2423, -66};
        int[] arr2 = {2, 5, -66, 23};
        int sum = solution(arr1);
        System.out.println(sum);
    }

    private static int solution(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if(Math.abs(arr[i]) > 0 && Math.abs(arr[i])< 100) {
                sum += arr[i];
            }
        }
        return sum;
    }
}
