package com.rahul.set1;

import java.util.function.BiFunction;

//  Write a Java 8 program using a lambda expression to add two integers.
public class LambdaAddition {
    public static void main(String[] args) {
        BiFunction<Integer, Integer, Integer>  add= (a,b) -> a+b;
        System.out.println(add.apply(10,20));
    }
}
