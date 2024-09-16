package org.example;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) return result;
        int rows = matrix.length; int cols = matrix[0].length;
        int up = 0, down = rows - 1, left = 0, right = cols - 1;

        while(up <= down && left <= right) {
            for(int col = left; col <= right; col++) result.add(matrix[up][col]);
            for(int row = up + 1; row <= down; row++) result.add(matrix[row][right]);
            if(up != down) for(int col = right - 1; col >= left; col--) result.add(matrix[down][col]);
            if(left != right) for(int row = down - 1; row > up; row--) result.add(matrix[row][left]);
            up++; down--; left++; right--;
        }
        return result;
    }
}
