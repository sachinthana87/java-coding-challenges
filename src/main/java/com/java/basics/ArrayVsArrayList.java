package com.java.basics;

public class ArrayVsArrayList {
    public static void main(String[] args) {
//        String[] friendsArray = new String[4];
        String[] friendsArray = {"Ann", "Ben", "Hen", "John"};
        for (int i = 0; i < friendsArray.length; i++) {
            System.out.println(friendsArray[i]);
        }
    }
}
