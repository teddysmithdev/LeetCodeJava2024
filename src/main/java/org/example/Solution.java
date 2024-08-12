package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
        if(digits.isEmpty()) {
            return result;
        }
        Map<Character, String> map = new HashMap<>();
        map.put('2', "abc");
        map.put('3', "def");
        map.put('4', "ghi");
        map.put('5', "jkl");
        map.put('6', "mno");
        map.put('7', "pqrs");
        map.put('8', "tuv");
        map.put('9', "wxyz");

        backtrack(digits, 0, "", result, map);
        return result;
    }


    private void backtrack(String digits, int index, String current, List<String> result, Map<Character, String> dic) {
        if (index == digits.length()) {
            result.add(current);
            return;
        }
        String letters = dic.get(digits.charAt(index));
        for(char letter : letters.toCharArray()) {
            backtrack(digits, index + 1, current + letter, result, dic);
        }
    }
}
