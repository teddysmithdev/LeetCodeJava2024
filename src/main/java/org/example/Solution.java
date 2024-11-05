package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> freqMap = new HashMap<>();
        for (int num : nums) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        List<Integer>[] buckets = new List[nums.length + 1];
        freqMap.forEach((num, freq) -> {
            if(buckets[freq] == null) buckets[freq] = new ArrayList<>();
            buckets[freq].add(num);
        });

        List<Integer> result = new ArrayList<>();
        for(int i = buckets.length - 1; i > 0 && result.size() < k; i--) {
            if(buckets[i] != null) result.addAll(buckets[i]);
        }

        return result.stream().mapToInt(i -> i).toArray();
    }
}
