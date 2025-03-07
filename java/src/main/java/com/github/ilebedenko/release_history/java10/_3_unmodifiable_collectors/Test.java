package com.github.ilebedenko.release_history.java10._3_unmodifiable_collectors;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Добавлены новые методы в Collectors:
 * - `toUnmodifiableList()`
 * - `toUnmodifiableSet()`
 * - `toUnmodifiableMap()`
 * Они позволяют собирать элементы Stream в unmodifiable коллекции.
 */
public class Test {
    public static void main(String[] args) {
        List<Integer> immutableList = IntStream.rangeClosed(1, 3)
                .boxed()
                .collect(Collectors.toUnmodifiableList());
        System.out.println(immutableList);

        Set<Integer> immutableSet = IntStream.rangeClosed(1, 3)
                .boxed()
                .collect(Collectors.toUnmodifiableSet());
        System.out.println(immutableSet);

        Map<String, Integer> immutableMap = IntStream.rangeClosed(1, 3)
                .boxed()
                .collect(Collectors.toMap(String::valueOf, Function.identity()));
        System.out.println(immutableMap);
    }
}
