package org.example;

public class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        for(int i = 0; i < (n + 1)/2; i++) {
            for(int j = 0; j < n/2; j++) {
                int temp = matrix[n - 1 - j][i];
                //Bottom right to bottom left
                matrix[n - 1 - j][i] = matrix[n - 1 - i][n - 1 - j];
                //Top right to bottom right
                matrix[n - 1 - i][n - 1 - j] = matrix[j][n - 1 - i];
                //Top left to top right
                matrix[j][n - 1 - i] = matrix[i][j];
                //Temp to top left
                matrix[i][j] = temp;
            }
        }
    }
}
