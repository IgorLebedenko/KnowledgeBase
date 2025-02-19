package com.github.ilebedenko.release_history.java11._4_collection_to_array_method;

import java.util.Arrays;
import java.util.List;

/**
 *  В интерфейс java.util.Collection был добавлен новый default метод:
 *  `toArray(IntFunction)` - возвращает массив указанного типа, собранный из коллекции
 */
public class Test {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("Java", "Kotlin", "Scala");

        // =============== BEFORE JAVA 11 ================
        String[] oldArray = list.toArray(new String[0]);

        // =============== AFTER JAVA 11 ================
        String[] newArray = list.toArray(String[]::new);
    }
}
