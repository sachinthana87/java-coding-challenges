package org.example;

import java.util.regex.Pattern;

public class SentenceSplitter {
    public static void main(String[] args) {
        String paragraph = "We test coders. Give us a try another? Test bugger";
        System.out.println(solution(paragraph));
    }

    private static int solution(String paragraph) {
        int maxWords = 0;
        String[] sentences = paragraph.split("[\\.\\?\\!]");
        for(String s: sentences) {
            s = s.trim();
            System.out.println(s);
            String[] words = s.split(" ");
            if(words.length > maxWords) maxWords = words.length;
        }
        return maxWords;
    }
}
