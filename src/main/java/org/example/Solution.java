package org.example;

public class Solution {
    public int numIslands(char[][] grid) {
        int numOfIslands = 0;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if(grid[i][j] == '1'){
                    traverseIsland(grid, i, j);
                    numOfIslands++;
                }
            }
        }
        return numOfIslands;
    }

    private void traverseIsland(char[][] grid, int i, int j) {
        if(grid[i][j] == '0'){
            return;
        }

        grid[i][j] = '0';

        if(i > 0) {
            traverseIsland(grid, i - 1, j);
        }
        if(i < grid.length - 1) {
            traverseIsland(grid, i + 1, j);
        }
        if(j > 0) {
            traverseIsland(grid, i, j - 1);
        }
        if(j < grid[0].length - 1) {
            traverseIsland(grid, i, j + 1);
        }
    }
}
