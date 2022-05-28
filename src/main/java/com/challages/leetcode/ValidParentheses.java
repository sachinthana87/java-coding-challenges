package com.challages.leetcode;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ValidParentheses {
    public static void main(String[] args) {
        String s = "([)]";
        System.out.println(isValid(s));
    }

    public static boolean isValid(String s) {

        char[] chars = s.toCharArray();
        if(chars.length % 2 != 0) return false;
        int openSquareB = 0;
        int openCurlyB = 0;
        int openNormalB = 0;
        LinkedList<Character> queue = new LinkedList<>();
        for (int i = 0; i < chars.length; i++) {
            switch (chars[i]) {
                case '[':
                    openSquareB++;
                    queue.push('[');
                    break;
                case '{':
                    openCurlyB++;
                    queue.push('{');
                    break;
                case '(':
                    openNormalB++;
                    queue.push('(');
                    break;
                case ']':
                    openSquareB--;
                    if(queue.size() == 0) return false;
                    Character c1 = queue.pop();
                    if(!c1.equals(new Character('['))) return false;
                    break;
                case '}':
                    openCurlyB--;
                    if(queue.size() == 0) return false;
                    Character c2 = queue.pop();
                    if(!c2.equals(new Character('{'))) return false;
                    break;
                case ')':
                    openNormalB--;
                    if(queue.size() == 0) return false;
                    Character c3 = queue.pop();
                    if(!c3.equals(new Character('('))) return false;
                    break;
                default:
                    return false;

            }
            if(openCurlyB < 0 || openSquareB < 0 || openNormalB < 0 ) return false;
        }
        if(openCurlyB > 0 || openSquareB > 0 || openNormalB > 0 ) return false;
        return true;
    }

    public static boolean isValid1(String s) {

        char[] chars = s.toCharArray();
        if(chars.length % 2 != 0) return false;
        Stack<Character> queue = new Stack<>();
        for (int i = 0; i < chars.length; i++) {
            switch (chars[i]) {
                case '[':
                    queue.push('[');
                    break;
                case '{':
                    queue.push('{');
                    break;
                case '(':
                    queue.push('(');
                    break;
                case ']':
                    if(queue.size() == 0) return false;
                    Character c1 = queue.pop();
                    if(!c1.equals(new Character('['))) return false;
                    break;
                case '}':
                    if(queue.size() == 0) return false;
                    Character c2 = queue.pop();
                    if(!c2.equals(new Character('{'))) return false;
                    break;
                case ')':
                    if(queue.size() == 0) return false;
                    Character c3 = queue.pop();
                    if(!c3.equals(new Character('('))) return false;
                    break;
                default:
                    return false;

            }
        }
        if(!queue.isEmpty()) return false;
        return true;
    }
}
