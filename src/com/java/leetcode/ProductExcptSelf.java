package com.java.leetcode;

import java.util.Arrays;

public class ProductExcptSelf {
    public static void main(String[] args) {
        int nums[] = {1, 2, 3, 4};

        ProductExcptSelf obj = new ProductExcptSelf();
        int[] ans = obj.productExceptSelf(nums);
        System.out.println(Arrays.toString(ans));
    }

    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        
        for (int i = 0; i < n; i++) {
            int prod = 1;
            for (int j = 0; j < n; j++) {
                if (i != j) {
                    prod *= nums[j];
                }
            }
            ans[i] = prod;
        }

        return ans;
    }
}
