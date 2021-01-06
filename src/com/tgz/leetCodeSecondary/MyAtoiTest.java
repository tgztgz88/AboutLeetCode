package com.tgz.leetCodeSecondary;

public class MyAtoiTest {
    public static void main(String[] args) {
        MyAtoiTest myAtoiTest=new MyAtoiTest();
        int result=myAtoiTest.myAtoi("3.1415");
        System.out.println(result);
    }
    public int myAtoi(String s) {
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
       int len=s.length();
       int i=0;
       //开始标志 0 一直没有遇到  1遇到了非空字符 开始记录result  大于1开始记录之后
        int startFlag=0;
        int negativeFlag=1;
        long result=0;
       while (i<len&&startFlag<2){
           char now=s.charAt(i);
           //这是一直没遇到第一个数字或符号
           if (now==' '){
               if(startFlag==0){
               i++;
               continue;}else {
               break;}
           }
           //遇到了第一个符号 开始读数字
           else if(now=='-'){
               if (startFlag==0){negativeFlag=-1;}
               startFlag++;
               i++;
               continue;
           }
           else if(now=='+'){
               if (startFlag==0){negativeFlag=+1;}
               startFlag++;
               i++;
               continue;
           }
           //遇到数字 开始记录 且要保证数字是连着的
           else if (now>='0'&&now<='9'){
               if(startFlag==0){startFlag++;}
               result=now-'0'+result*10;
               if (result*negativeFlag>Integer.MAX_VALUE){return  2147483647;}
               if (result*negativeFlag<Integer.MIN_VALUE){return -2147483648;}
               i++;
               continue;
           }
           else {if (startFlag==0){
             return 0;
            }if(startFlag==1){return (int)result*negativeFlag;}
           }
       }
       return (int)result*negativeFlag;
    }
}



