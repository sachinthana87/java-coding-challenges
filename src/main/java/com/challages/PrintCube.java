package com.challages;

public class PrintCube {
    public static void main(String[] args) {
        int[] arr = {3, 6, 8, 7, 6, 3, 4, 10 ,6};
        printCube(arr);

    }

    private static void printCube(int[] arr) {
        for(int i : arr) {
            if(i % 2 != 0) {
                double result = Math.pow(i, 3);
                System.out.println(result);
            }
        }
    }
}
