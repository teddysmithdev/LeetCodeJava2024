package org.example;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        permutation(nums, result, new LinkedHashSet<>());
        return result;
    }
    private void permutation(int[] nums, List<List<Integer>> result, Set<Integer> set) {
        if(set.size() == nums.length) {
            result.add(new ArrayList<>(set));
            return;
        }
        for(int i = 0; i < nums.length; i++) {
            if(!set.contains(nums[i])) {
                set.add(nums[i]);
                permutation(nums, result, set);
                set.remove(nums[i]);
            }
        }
    }
}
