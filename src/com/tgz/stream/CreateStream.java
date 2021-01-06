package com.tgz.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class CreateStream {
    public static void main(String[] args) {
        //创建流的4种方式

        //1 通过集合
        List<String> list=new ArrayList<>();
        list.add("eee");
        list.add("ddd");
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        Stream<String> stringStream=list.stream();

        //2 通过数组
        int[] arr={1,2,3,4,5};
        IntStream integerStream= Arrays.stream(arr);

        //3 Stream类本身的静态方法
        Stream<Double> integerStream1 = Stream.of(1.1, 2.2, 3.3, 4.4, 5.5);

        //4 无线流
        //生成
        Stream.generate(()->Math.random()*100).limit(10).forEach(System.out::println);
        //迭代
        Stream.iterate(0, t->t+2).limit(10).forEach(System.out::println);
    }
}
