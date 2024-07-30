package org.example;

public class Solution {
    public int maxSubArray(int[] nums) {
        int maxSum = nums[0];
        int currentSum = 0;
        for (int num : nums) {
            //This is the negative number reset
            currentSum = Math.max(currentSum, 0);
            currentSum += num;
            maxSum = Math.max(maxSum, currentSum);
        }
        return maxSum;
    }
}
