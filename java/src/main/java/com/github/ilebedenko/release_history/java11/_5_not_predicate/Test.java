package com.github.ilebedenko.release_history.java11._5_not_predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * Добавлен новый метод для создания отрицания предиката:
 * `not(Predicate)` - возвращает Predicate, являющийся отрицанием переданного предиката
 */
public class Test {

    public static void main(String[] args) {
        List<String> words = Arrays.asList(
                "Hello, ",
                "   ",
                "world!",
                "\n\t"
        );

        words.stream()
                .filter(Predicate.not(String::isBlank))
                .forEach(System.out::print);
    }
}
