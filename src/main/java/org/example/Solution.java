package org.example;

public class Solution {
    public int characterReplacement(String s, int k) {
        int[] charCount = new int[26];
        int start = 0, maxFreq = 0, maxLength = 0;

        for(int end = 0; end < s.length(); end++) {
            charCount[s.charAt(end) - 'A']++;
            maxFreq = Math.max(maxFreq, charCount[s.charAt(end) - 'A']);

            while((end - start + 1) - maxFreq > k) {
                charCount[s.charAt(start) - 'A']--;
                start++;
            }

            maxLength = Math.max(maxLength, end - start + 1);
        }
        return maxLength;
    }
}
