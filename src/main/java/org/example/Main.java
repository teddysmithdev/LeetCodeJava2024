package org.example;


public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        char[][] board2 = {
                {'A', 'B', 'C', 'E'},
                {'S', 'F', 'C', 'S'},
                {'A', 'D', 'E', 'E'}
        };
        String word2 = "SEE"; // Expected: true
        solution.exist(board2, word2);
    }
}