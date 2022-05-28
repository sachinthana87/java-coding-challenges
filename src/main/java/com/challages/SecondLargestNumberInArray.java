package com.challages;

import java.text.MessageFormat;

public class SecondLargestNumberInArray {
    public static void main(String[] args) {
        int[] arr = {3, 4, 6, 7, 2, 4, 9, 4,5,6, 30, 20, 22, 25,  45, 32,30};
        System.out.println(solution(arr));
    }

    public static int solution(int[] arr) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length / 2; i++) {
            System.out.println(MessageFormat.format("i: {0}, length - i: {1}", arr[i], arr[arr.length - 1 - i]));
            if(arr[i] > arr[arr.length - 1 - i]) {
                if(arr[i] > largest) {
                    secondLargest = largest;
                    largest = arr[i];
                }else if (arr[i] > secondLargest) {
                    secondLargest = arr[i];
                }
            }else if (arr[i] < arr[arr.length - 1 - i]) {
                if(arr[arr.length - 1 - i] > largest) {
                    secondLargest = largest;
                    largest = arr[arr.length - 1 - i];
                }else if (arr[arr.length - 1 - i] > secondLargest) {
                    secondLargest = arr[arr.length - 1 - i];
                }
            }
        }
        return Math.min(largest, secondLargest);
    }
}
