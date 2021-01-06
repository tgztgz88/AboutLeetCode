package com.tgz.leetCodeSimple;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StreamFunctionTest {
    public static void main(String[] args) {
    //关于流的api的方法 筛选与切片
    //过滤 filter
     Arrays.asList("aaa","bbb","ccc","ddd").stream().filter(str->str.equals("aaa")).forEach(System.out::println);
    //截取 limit
     Arrays.asList("aaa","bbb","ccc","ddd").stream().limit(2).forEach(System.out::println);
    //截取 skip
     Arrays.asList("aaa","bbb","ccc","ddd").stream().skip(2).forEach(System.out::println);
    //截取 limit
     Arrays.asList("aaa","aaa","bbb","ccc","ddd").stream().distinct().forEach(System.out::println);
        List<String> l1=new ArrayList<>();

    }

}
