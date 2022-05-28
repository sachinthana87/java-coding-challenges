package com.other;

public class ByteTest {
    public static void main(String[] args) {
        byte x = 64;
        int i;
        byte y;
        i = x << 2; // 111111, 100000 - 256
        y = (byte) (x << 2);
        System.out.println(i+ " " + y);
    }
}
