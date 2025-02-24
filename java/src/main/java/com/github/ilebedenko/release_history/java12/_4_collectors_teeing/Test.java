package com.github.ilebedenko.release_history.java12._4_collectors_teeing;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Добавлен новый метод в Collectors:
 * <p>
 * `Collectors.teeing(Collector, Collector, BiFunction)` - собирает данные с помощью двух независимых Collectors,
 *                      а затем объединяет их результаты с помощью предоставленной BiFunction.
 */
public class Test {

    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 3, 4, 5};

        Map<String, Integer> info = Arrays.stream(nums)
                .boxed()
                .collect(Collectors.teeing(
                        Collectors.minBy(Integer::compareTo),
                        Collectors.maxBy(Integer::compareTo),
                        (min, max) -> Map.of("min", min.get(), "max", max.get()))
                );
        System.out.println(info);

        Double mean = Arrays.stream(nums)
                .boxed()
                .collect(Collectors.teeing(
                        Collectors.summingInt(i -> i),
                        Collectors.counting(),
                        (sum, count) -> (double) sum / count)
                );
        System.out.println(mean);
    }
}
