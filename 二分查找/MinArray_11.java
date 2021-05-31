package com.leetcode.二分查找;

import java.util.ArrayList;

// 剑指 Offer 11. 旋转数组的最小数字
public class MinArray_11 {
    public static void main(String[] args) {
        System.out.println(minArr(new int[]{2,3,4,0,1}));
    }

    public static int minArr(int[] numbers) {
        int low = 0;
        // high可以区分左排序数组和右排序数组，左排序数组的值都>=numbers[high]，右排序数组的值都<=numbers[low]，最小值处于两个数组中间
        int high = numbers.length - 1;
        while(low < high) {
            int middle = low + (high - low) / 2;
            if (numbers[middle] < numbers[high]) {
                // middle处于右排序数组中
                high = middle;
            } else if (numbers[middle] > numbers[high]) {
                low = middle + 1;
            } else {
                high -= 1;
            }
        }
        return numbers[low];
    }
}
