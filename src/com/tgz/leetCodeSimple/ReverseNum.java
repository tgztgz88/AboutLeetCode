package com.tgz.leetCodeSimple;


public class ReverseNum {
    public static void main(String[] args) {
         int x=1534236469;
         ReverseNum reverseNum=new ReverseNum();
         int result=reverseNum.Reverse(x);
        System.out.println(result);
    }

    public int Reverse(int x){
        int flog=1;
        Integer result=0;
        if (x<0){
            flog=-1;
            x=-x;
        }
       String ss=String.valueOf(x);
       char [] chararr1=new char[ss.length()];
       ss.getChars(0,ss.length(),chararr1,0);
        System.out.println(chararr1.length);
        System.out.println(ss.length());
        char [] chararr2=new char[ss.length()];
        for (int i =chararr1.length-1,j=0; i >-1; i--,j++) {
            chararr2[j]=chararr1[i];
        }
       String resultstr=String.valueOf(chararr2);
        result=Integer.valueOf(String.valueOf(chararr2));
        return result*flog;
    }
}
