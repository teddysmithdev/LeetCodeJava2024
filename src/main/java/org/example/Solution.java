package org.example;

public class Solution {
    public int[] productExceptSelf(int[] nums) {
        if(nums == null || nums.length == 0) return new int[0];

        int n = nums.length;
        int[] res = new int[n];

        int prefix = 1, suffix = 1;

        for(int i = 0; i < n; i++) {
            res[i] = prefix;
            prefix *= nums[i];
        }

        for(int i = n - 1; i >= 0; i--) {
            res[i] *= suffix;
            suffix *= nums[i];
        }
        return res;
    }
}
