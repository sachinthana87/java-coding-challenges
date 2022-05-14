package org.example;


public class Chocolates {
    /**
     * x is numbered from 1 to y
     * x is odd buy x chocolates
     * x is even no purchases
     *
     * @param args
     */

    public static void main(String[] args) {
        int[] array = {6, 7};
        calculate(array);
    }

    private static void calculate(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int noOfChocs = 0;
            int n = arr[i];
            for (int j = 1; j <= n; j++) {
                if(j % 2 != 0) noOfChocs += j;
            }
            System.out.println(noOfChocs);
        }
    }
}
