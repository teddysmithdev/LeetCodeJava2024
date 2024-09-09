package org.example;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0) return 0;

        Set<Integer> uniqueNumbers = new HashSet<>();
        for (int num : nums) {
            uniqueNumbers.add(num);
        }
        int maxLengthOfSequence = 0;
        for(int num : uniqueNumbers) {
            if(!uniqueNumbers.contains(num - 1)) {
                int currentLengthOfSequence = 1;

                while(uniqueNumbers.contains(num + 1)) {
                    num++;
                    currentLengthOfSequence++;
                }
                maxLengthOfSequence = Math.max(maxLengthOfSequence, currentLengthOfSequence);
            }
        }
        return maxLengthOfSequence;
    }
}
