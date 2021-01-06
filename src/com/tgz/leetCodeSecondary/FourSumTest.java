package com.tgz.leetCodeSecondary;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class FourSumTest {
    public static void main(String[] args) {
     FourSumTest fourSumTest=new FourSumTest();
     int[]   nums = {1, 0, -1, 0, -2, 2};
        int[]   nums1 = {-2,-1,-1,1,1,2,2};
        List<List<Integer>> lists = fourSumTest.fourSum(nums1, 0);
        for (List<Integer> a:lists){
            System.out.println(a);
        }
    }
    private List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> result=new LinkedList<>();
        if (nums.length<4){
              return result;
          }
        int length=nums.length;
        Arrays.sort(nums);
        for (int i = 0; i < (length - 3); i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            if (nums[i]+nums[i+1]+nums[i+2]+nums[i+3]>target){
                break;
            }
            if (nums[i]+nums[length-1]+nums[length-2]+nums[length-3]<target){
                continue;
            }
            for (int j = i+1; j < (length - 2); j++) {
                if (j > i + 1 && nums[j] == nums[j - 1]) {
                    continue;
                }
                if (nums[i]+nums[j]+nums[j+1]+nums[j+2]>target){
                    break;
                }
                if (nums[i]+nums[j]+nums[length-2]+nums[length-1]<target){
                    continue;
                }
                int left=j+1,right=length-1;
                while (left<right){
                    int sum=nums[i]+nums[j]+nums[left]+nums[right];
                    if (sum==target){
                        result.add(Arrays.asList(nums[i],nums[j],nums[left],nums[right]));
                        while (left < right && nums[left] == nums[left + 1]){left++;}
                        left++;
                        while (left < right && nums[right] == nums[right - 1]){right--;}
                        right--;
                    }
                    else if (sum>target){right--;}
                    else if (sum<target){left++;}
                }
            }
        }
        return result;
    }
}
