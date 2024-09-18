package org.example;

public class Solution {
    public int removeElement(int[] nums, int val) {
        int validIndex = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] != val) {
                int temp = nums[validIndex];
                nums[validIndex] = nums[i];
                nums[i] = temp;
                validIndex++;
            }
        }
        return validIndex;
    }
}
