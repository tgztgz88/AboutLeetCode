package com.tgz.leetCodeSimple;

public class FunctionInterfaceTest {
    public static void main(String[] args) {
        Runnable r1=new Runnable() {
            @Override
            public void run() {
                System.out.println("aaa");
            }
        };
        r1.run();
        //lambda表达式试用
        Runnable r2=()->System.out.println("bbb");
        ;




    }
}
