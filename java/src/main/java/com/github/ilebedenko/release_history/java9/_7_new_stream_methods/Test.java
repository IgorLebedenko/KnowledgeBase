package com.github.ilebedenko.release_history.java9._7_new_stream_methods;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Новые методы Stream:
 * <p>
 * `takeWhile(Predicate)` - берет элементы потока до тех пор, пока не встретится элемент, подходящий под предикат
 * <p>
 * `dropWhile(Predicate)` - удаляет элементы потока до тех пор, пока не встретится элемент, подходящий под предикат
 * <p>
 * `iterate(T, UnaryOperator)` - создает поток элементов,
 *          где первый аргумент - начальное значение, второй - шаг приращения
 * <p>
 * `iterate(T, Predicate, UnaryOperator)` - создает поток элементов,
 *          где первый аргумент - начальное значение, второй - условие выхода, а третий - шаг приращения (аналог for)
 * <p>
 * `ofNullable(T)` - позволяет создавать поток, избегая ошибок с null значениями
 */
public class Test {
    public static void main(String[] args) {
        // takeWhile    -> 1 2 3 4
        IntStream.range(1, 10)
                .takeWhile(i -> i < 5)
                .forEach(i -> System.out.print(i + " "));
        System.out.println();

        // dropWhile    -> 5 6 7 8 9
        IntStream.range(1, 10)
                .dropWhile(i -> i < 5)
                .forEach(i -> System.out.print(i + " "));
        System.out.println();

        // iterate      -> 1 3 5 7 9
        IntStream.iterate(1, i -> i + 2)
                .takeWhile(i -> i < 10)
                .forEach(i -> System.out.print(i + " "));
        System.out.println();

        // iterate      -> 1 3 5 7 9   (same as for loop)
        IntStream.iterate(1, i -> i < 10, i -> i + 2)
                .forEach(i -> System.out.print(i + " "));
        System.out.println();

        // ofNullable
        // проверка внутренних значений, игнорируя null
        List<List<String>> list = new ArrayList<>();
        list.add(List.of("a", "b", "c"));
        list.add(null);
        list.add(List.of("d", "e", "f"));
        List<String> result = list.stream()
                .flatMap(Stream::ofNullable)
                .flatMap(Collection::stream)
                .collect(Collectors.toList());
        System.out.println(result);
    }
}
