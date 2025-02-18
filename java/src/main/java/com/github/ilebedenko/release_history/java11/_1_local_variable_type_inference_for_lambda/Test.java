package com.github.ilebedenko.release_history.java11._1_local_variable_type_inference_for_lambda;

import org.jetbrains.annotations.NotNull;

import java.util.List;

/**
 * Использование зарезервированного слова var в lambda выражениях позволяет
 * применять аннотации к локальным переменным без потери краткости.
 * <p>
 * Недопустимое использование:
 * - задание var не для всех параметров     <code>(var s1, s2) -> s1 + s2</code
 * - смешение var с другими типами          <code>(var s1, String s2) -> s1 + s2</code>
 * - задание var без скобок                 <code>var s1 -> s1.toUpperCase()</code>
 */
public class Test {

    public static void main(String[] args) {
        List<String> list = List.of("Java", "Kotlin", "Scala");

        list.forEach((@NotNull var s) -> System.out.println(s.toUpperCase()));
    }
}
