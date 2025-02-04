package com.rahul;

import java.util.*;
import java.util.function.BiFunction;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Test {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4);
        boolean anyMatch = numbers.stream().anyMatch(p -> p % 2 == 0);
        System.out.println(anyMatch);
    }
}

