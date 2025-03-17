package com.github.ilebedenko.release_history.java19._1_new_hashmap_method;

import java.util.HashMap;

/**
 * В `HashMap`, `LinkedHashMap` и `WeakHashMap` добавлен новый метод `newHashMap(int)`.
 * <p>
 * Этот метод полезен, когда вы заранее знаете количество элементов, которые будут храниться в HashMap.
 * Метод возвращает `HashMap` достаточно большой вместимости, чтобы гарантировать,
 * что указанное количество элементов будет добавлено без расширения вместимости коллекции.
 */
public class Test {

    public static void main(String[] args) {
        // будет расширен при достижении более 120 * 0.75 = 90 элементов
        new HashMap(120);

        // будет расширен только при достижении более 120 элементов,
        // так как изначальная вместимость 120 \ 0.75 = 160
        HashMap.newHashMap(120);
    }
}
