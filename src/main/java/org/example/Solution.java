package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public int[][] merge(int[][] intervals) {
        if (intervals == null || intervals.length == 0) {
            return new int[0][0];
        }
        List<int[]> ans = new ArrayList<>();
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

        for(int i = 0; i < intervals.length; i++) {
            int tempMin = intervals[i][0];
            int tempMax = intervals[i][1];
            while(i + 1 < intervals.length && (intervals[i + 1][0] <= tempMax || intervals[i + 1][1] <= tempMax)) {
                tempMax = Math.max(tempMax, intervals[i + 1][1]);
                i++;
            }
            ans.add(new int[]{tempMin, tempMax});
        }
        return ans.toArray(new int[0][]);
    }
}
