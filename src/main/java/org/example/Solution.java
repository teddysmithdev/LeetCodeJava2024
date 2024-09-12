package org.example;

public class Solution {
    public String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();
        String[] array = s.split(" ");
        for(int i = array.length - 1; i >= 0; i--) {
            if(!array[i].isEmpty()) {
                sb.append(array[i] + " ");
            }
        }
        return sb.toString().trim();
    }
}
