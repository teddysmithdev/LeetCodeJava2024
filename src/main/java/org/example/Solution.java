package org.example;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> r = new ArrayList<>();
        for(int i = 0; i < numRows; i++) {
            List<Integer> row = new ArrayList<>();
            for(int j = 0; j <= i; j++) {
                row.add(1);
            }
            for(int j = 1; j < i; j++) {
                int valueAboveLeft = r.get(i - 1).get(j - 1);
                int valueAboveRight = r.get(i - 1).get(j);
                int sum = valueAboveLeft + valueAboveRight;
                row.set(j, sum);
            }
            r.add(row);
        }
        return r;
    }
}
