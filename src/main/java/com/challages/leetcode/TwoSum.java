package com.challages.leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = twoSumSecond(nums, target);
        System.out.printf(result[0] + ", " + result[1]);
    }

    /**
     *
     * time complexity O(n Squared)
     * space complexity O(1). space used is constant, does not depend on teh array size
     */
    public static  int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = 1; j < nums.length; j++) {
                if(target == nums[i] + nums[j] && i != j) {
                    result[0] = i;
                    result[1] = j;
                    break;
                }
            }
        }
        return result;
    }

    /**
     *
     * time complexity O(nLogn)
     * space complexity O(n). space used is constant, does not depend on teh array size
     */
    public static  int[] twoSumSecond(int[] nums, int target) {
        Map<Integer, Integer> integerMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int x = target - nums[i];
            if(integerMap.containsKey(x)) {
                int index = integerMap.get(x);
                return new int[] {index, i};
            }else {
                integerMap.put(nums[i], i);
            }
        }
        return new int[2];
    }
}
