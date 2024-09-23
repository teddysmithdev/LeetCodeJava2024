package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Solution {
    public int findKthLargest(int[] nums, int k) {
        List<Integer> list = new ArrayList<>();
        for(int num : nums) {
            list.add(num);
        }
        return quickSelect(list, k);
    }
    private int quickSelect(List<Integer> nums, int k) {
        if(nums.size() == 1) return nums.get(0);
        int pivotIndex = new Random().nextInt(nums.size());
        int pivot = nums.get(pivotIndex);

        List<Integer> less = new ArrayList<>();
        List<Integer> equal = new ArrayList<>();
        List<Integer> greater = new ArrayList<>();

        for(int num : nums) {
            if(num > pivot) {
                greater.add(num);
            } else if(num < pivot) {
                less.add(num);
            } else {
                equal.add(num);
            }
        }
        if(k <= greater.size()) {
            return quickSelect(greater, k);
        }
        if(greater.size() + equal.size() < k) {
            return quickSelect(less, k - greater.size() - equal.size());
        }
        return pivot;
    }
}
