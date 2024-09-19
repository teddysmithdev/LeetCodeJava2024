package org.example;

public class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0, count = 0;
        for(int num : nums) {
            count = (num == 1) ? count + 1 : 0;
            max = Math.max(max, count);
        }
        return max;
    }
}
