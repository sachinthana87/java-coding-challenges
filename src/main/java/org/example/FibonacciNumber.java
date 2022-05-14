package org.example;

public class FibonacciNumber {

    private static int fibonacciNumber(int n) {
        int lastValue = 0;
        int nextValue = 1;

        for (int i = 2; i < n; i++) {
            int temp = nextValue;
            nextValue = lastValue + nextValue;
            lastValue = temp;
        }
        return nextValue;
    }

    public static void main(String[] args) {
        int n = 7;
        System.out.println(fibonacciNumber(n));
    }
}
