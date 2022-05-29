package com.other;

public class StringImmutability {
    public static void main(String[] args) {
        String a = "Test";
        String b = "Test";
//        a = b;
//        System.out.println(a);
//
//        changeString(a);
//
//        a = "Test1";
//        System.out.println(a);
//        System.out.println(b);
        System.out.println(a.hashCode());
        System.out.println(b.intern());
    }

    public static void changeString(String a) {
        a = "Test2";
    }
}
