package org.example;

public class Solution {
    public boolean validMountainArray(int[] arr) {
        if(arr.length < 3) return false;

        int left = 0, right = arr.length - 1;

        while(left + 1 < arr.length && arr[left] < arr[left + 1]) left++;

        while(right > 0 && arr[right - 1] > arr[right]) right--;

        return left == right && left != 0 && right != arr.length - 1;
    }
}
