package org.example;

public class Solution {
    public int maxProduct(int[] nums) {
        if(nums.length == 0) return 0;

        int maxProduct = nums[0];
        int minProduct = nums[0];
        int result = nums[0];

        for(int i = 1; i < nums.length; i++) {
            int current = nums[i];

            int tempMax = Math.max(current, Math.max(maxProduct * current, minProduct * current));

            minProduct = Math.min(current, Math.min(maxProduct * current, minProduct * current));
            maxProduct = tempMax;

            result = Math.max(result, maxProduct);
        }

        return result;
    }
}
