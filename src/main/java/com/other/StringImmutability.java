package com.other;

public class StringImmutability {
    public static void main(String[] args) {
        String a = "Test";
        String b = "test";
        a = b;
        System.out.println(a);

        changeString(a);

        a = "Test1";
        System.out.println(a);
    }

    public static void changeString(String a) {
        a = "Test2";
    }
}
