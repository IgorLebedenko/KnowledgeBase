package com.github.ilebedenko.release_history.java21._3_pattern_matching_for_switch;

import static com.github.ilebedenko.release_history.java21._3_pattern_matching_for_switch.Util.*;

/**
 * Добавлена поддержка паттернов в switch
 * <p>
 * На что стоит обратить внимание:
 * - в ветках должны покрываться все возможные случаи
 * - все ветки case должны располагаться в таком порядке, что ни перед одной веткой нет доминирующей ветки
 * - несколько паттернов в одной ветке работать не будут
 */
public class Test {

    public static void main(String[] args) {

        // switch поддерживает в ветках case паттерны
        switch (randomTypeObject()) {
            case Integer i -> System.out.println("Integer: " + i);
            case String s -> System.out.println("String: " + s);
            case Boolean b -> System.out.println("Boolean: " + b);
            case Object o -> System.out.println("Object: " + o);
        }

        // Паттерны могут сопровождаться условиями с ключевым словом when
        switch (randomIntObject()) {
            case Integer i when i > 0 -> System.out.println("Positive Integer: " + i);
            case Integer i when i < 0 -> System.out.println("Negative Integer: " + i);
            case Integer i -> System.out.println("Integer: " + i);
        }

        // Добавлена обработка null значения.
        // Если null передан, то обрабатывать его обязательно, иначе - NullPointerException
        switch (randomTypeObjectWithNull()) {
            case null -> System.out.println("null");
            case Integer i -> System.out.println("Integer: " + i);
            case String s -> System.out.println("String: " + s);
            default -> System.out.println("Other");
        }

        // null и default могут быть объединены в одну ветку
        switch (randomString()) {
            case "Foo", "Bar" -> System.out.println("Foo or Bar");
            case null, default -> System.out.println("Null or other");
        }
    }
}
