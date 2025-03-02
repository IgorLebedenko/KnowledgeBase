package com.github.ilebedenko.release_history.java11._4_collection_to_array_method;

import java.util.Arrays;
import java.util.List;

/**
 *  В интерфейс `java.util.Collection` был добавлен новый default метод:
 *  <p>
 *  `toArray(IntFunction)` - возвращает массив указанного типа, собранный из коллекции
 */
public class Test {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("Java", "Kotlin", "Scala");

        // =============== OLD ================
        String[] oldArray = list.toArray(new String[0]);

        // =============== SINCE JAVA 11 ================
        String[] newArray = list.toArray(String[]::new);
    }
}
