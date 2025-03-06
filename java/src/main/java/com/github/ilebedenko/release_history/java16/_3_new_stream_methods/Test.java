package com.github.ilebedenko.release_history.java16._3_new_stream_methods;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.stream.Collectors;

/**
 * Новые методы Stream:
 * <p>
 * `toList()` - более короткий способ получения списка по сравнению с использованием `collect(Collectors.toList())`
 * <p>
 * `mapMulti()` - объединение коллекций потока в одну коллекцию.
 *          Более эффективная, но менее читаемая альтернатива `flatMap`.
 *          Эффективность достигается за счет того, что для каждого вложенного элемента не создается отдельный Stream объект.
 */
public class Test {

    public static void main(String[] args) {
        // toList
        List<String> intAsString = Arrays.asList("1", "2", "3");

        // ==================== OLD =====================
        List<Integer> ints = intAsString.stream().map(Integer::parseInt).collect(Collectors.toList());
        System.out.println(ints);

        // =============== SINCE JAVA 16 ================
        ints = intAsString.stream().map(Integer::parseInt).toList();
        System.out.println(ints);


        // mapMulti
        var multiList = List.of(
                List.of(1, 2, 3),
                List.of(4, 5, 6),
                List.of(7, 8, 9));

        // ==================== OLD =====================
        List<Integer> list = multiList.stream()
                .flatMap(List::stream)
                .toList();
        System.out.println(list);

        // ========= ALTERNATIVE SINCE JAVA 16 =========
        list = multiList.stream()
                .mapMulti((List<Integer> nums, Consumer<Integer> consumer) -> nums.forEach(n -> consumer.accept(n)))
                .toList();
        System.out.println(list);
        // or shorter
        list = multiList.stream()
                .mapMulti((BiConsumer<List<Integer>, Consumer<Integer>>) Iterable::forEach)
                .toList();
        System.out.println(list);
    }
}
