package com.rohit.dsa;

public class FindLargestSubArraySumBruteForce {


    public static void main(String[] args) {
        int [] nums = {-2,-3,4,-1,-2,1,5,-3};

        int largestSum = bruteforce(nums);
        System.out.println("Largest Sum: " + largestSum);
    }

    // Time Complexity - O(n*n)
    private static int bruteforce(int[] nums) {
        int maxSum = nums[0];

        for (int i = 0; i < nums.length; i++) {
            int curSum = 0;

            for (int j = i; j < nums.length; j++) {
                curSum += nums[j];
                maxSum = Math.max(curSum, maxSum);
            }
        }

        return maxSum;
    }


}
