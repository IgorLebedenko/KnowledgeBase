package com.github.ilebedenko.release_history.java10._4_new_optional_method;

import java.util.List;

/**
 * Новый метод Optional:
 * <p>
 * orElseThrow() - бросается исключение NoSuchElementException, если Optional не имеет значения
 */
public class Test {
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 3);
        int number = list.stream()
                .filter(i -> i % 2 == 0)
                .findAny()
                .orElseThrow();
        System.out.println(number);

        list = List.of(1, 3);
        number = list.stream()
                .filter(i -> i % 2 == 0)
                .findAny()
                .orElseThrow();
        System.out.println(number);
    }
}
