package com.tgz.leetCodeSimple;

import java.io.PrintStream;
import java.util.function.Consumer;

public class FunctionRecommend {

    public static void main(String[] args) {
        PrintStream ps=System.out;
        Consumer<String> con=ps::println;
        con.accept("abc");
    }
}
