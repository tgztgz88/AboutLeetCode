package com.tgz.leetCodeSimple;


public class RemoveDuplicatesTest {
    public static void main(String[] args) {
        int[] a={1,1,2};
        RemoveDuplicatesTest removeDuplicatesTest = new RemoveDuplicatesTest();
        int result=removeDuplicatesTest.removeDuplicatesTest(a);
        System.out.println(result);
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]);
        }
    }
    public int removeDuplicatesTest(int[] nums){
         int len=nums.length;
         int result=nums.length;
         int x=nums.length;
        for (int i = 0; i < x-1;) {
            if (nums[i]==nums[i+1]){
             result--;
             System.arraycopy(nums,i+1,nums,i,len-i-1);
             x--;
             continue;
            }
            i++;
        }
        return result;
    }
}
