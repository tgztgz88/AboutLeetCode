package com.tgz.leetCodeSimple;

import java.util.Arrays;

public class ThreeSumClosestTest {
    public static void main(String[] args) {
        int[] nums ={1,2,5,10,11};
        int target = 13;
        ThreeSumClosestTest threeSumClosestTest=new ThreeSumClosestTest();
        int result=threeSumClosestTest.threeSumClosest(nums,target);
        System.out.println(result);
    }
    public int threeSumClosest(int[] nums, int target){
        Arrays.sort(nums);
        int result=nums[0]+nums[1]+nums[2];

        for (int i = 0; i < nums.length-2; i++) {
            int sum=0;
            int j=i+1;
            int k=nums.length-1;
         while (j<k){
             sum=nums[i]+nums[j]+nums[k];
             if (Math.abs(sum-target)<Math.abs(result-target)){result=sum;}
            if (sum>target){k--;continue;}
            else if (sum<target){j++;continue;}
            else if (sum==target){return target;}
            }
        }
        return result;
    }
}
