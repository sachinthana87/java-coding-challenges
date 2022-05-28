package com.interviews.zalando;

import java.util.TreeSet;

public class ContactFinder {
    public static void main(String[] args) {
        String[] a = {"sachin", "janitha", "sanath", "ann"};
        String[] b = {"2342323", "343445", "34345345", "4232354345"};
        String p = "4232";
        System.out.println(solution(a, b, p));
    }

    public static String solution(String[] a, String[] b, String p) {

        TreeSet<String> matches = new TreeSet<>();
        for (int i = 0; i < b.length; i++) {
            if(b[i].contains(p)) {
                matches.add(a[i]);
            }
        }
        if(!matches.isEmpty()) return matches.first();
        return "NO CONTACT";
    }
}
