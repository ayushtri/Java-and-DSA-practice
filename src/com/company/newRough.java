package com.company;

import java.util.Arrays;

class Solution {
    public int[] twoSum(int[] nums,int target){
        Arrays.sort(nums);
        int j= nums.length-1;
        int i=0;
        while(i< nums.length){
            if(nums[i]+nums[j]==target){
                return new int[] {i,j};
            }
            else if(nums[i]+nums[j]>target){
                j--;
            }
            else if(nums[i]+nums[j]<target) i++;
        }

        throw new IllegalArgumentException("no match found");
    }
}

/*
class Solution {
    public int[] twoSum(int[] nums, int target) {
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                int temp=target-nums[i];
                if(temp==nums[j]){
                    return new int[] {i,j};
                }
            }
        }
        throw new IllegalArgumentException("no match found");
    }
}

 */

public class newRough {
    public static void main(String[] args) {
        int[] n={3,2,4};
        Solution s=new Solution();
        System.out.println(Arrays.toString(s.twoSum(n,6)));
        for (int i : n) {
            System.out.print(i + ",");
        }
    }
}
