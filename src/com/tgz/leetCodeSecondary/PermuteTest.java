package com.tgz.leetCodeSecondary;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;
import java.util.concurrent.DelayQueue;

public class PermuteTest {
    public static void main(String[] args) {
         int[] a={1,2,3};
        PermuteTest permuteTest = new PermuteTest();
        List<List<Integer>> result = permuteTest.permute(a);
        System.out.println(result);
    }

    public List<List<Integer>> permute(int[] nums) {
        int len=nums.length;
        List<List<Integer>> result=new ArrayList<>();
        if(len<0){
            return result;
        }
        boolean[] used=new boolean[len];
        Deque<Integer> path=new ArrayDeque();
        permutedfs(nums,len,0,path,used,result);
        return result;
    }

    private void permutedfs(int[] nums, int len, int depth,Deque<Integer> path,boolean[] used, List<List<Integer>> result) {
        if (depth==len){
            result.add(new ArrayList<>(path));
            return;
        }
        for (int i = 0; i < len; i++) {
            if (used[i]){
                continue;
            }
            path.addLast(nums[i]);
            used[i]=true;
            permutedfs(nums,len,depth+1,path,used,result);
            path.removeLast();
            used[i]=false;
        }
    }
}
