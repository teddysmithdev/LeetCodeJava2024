package org.example;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int romanToInt(String s) {
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int total = 0;
        int prevValue = 0;
        for(char c : s.toCharArray()) {
            int currentValue = map.get(c);
            if(currentValue > prevValue) {
                total += currentValue - (2 * prevValue);
            } else {
                total += currentValue;
            }
            prevValue = currentValue;
        }
        return total;
    }
}
