package org.example;

import java.util.*;

public class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> result = new HashSet<>();
        for (int i = 0; i < nums.length - 2; i++) {
            Set<Integer> seen = new HashSet<>();
            for (int j = i + 1; j < nums.length; j++) {
                int complement = -nums[i] - nums[j];
                if (seen.contains(complement)) {
                    int a = nums[i];
                    int b = nums[j];
                    int c = complement;
                    List<Integer> list = Arrays.asList(Math.min(a, Math.min(b, c)),
                            a + b + c - Math.min(a, Math.min(b,c)) - Math.max(a, Math.max(b, c)),
                            Math.max(a, Math.max(b, c)));
                    result.add(list);
                }
                seen.add(nums[j]);
            }
        }
        return new ArrayList<>(result);
    }
}
