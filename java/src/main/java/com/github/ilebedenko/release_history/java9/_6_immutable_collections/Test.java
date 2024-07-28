package com.github.ilebedenko.release_history.java9._6_immutable_collections;

import java.util.*;

/**
 * Были добавлены статичные фабричные методы для упрощенного создания Immutable коллекций
 * <p>
 * Особенности ImmutableCollections
 * - нельзя изменить, при попытке получим UnsupportedOperationException;
 * - в метод of() нельзя передать null, во всех коллекциях получим NullPointerException;
 * - потокобезопасны
 * - потребляют меньше памяти аналогичных мутируемых коллекций
 * <p>
 * Различие UnmodifiableCollections и ImmutableCollections заключается в том,
 * что в первом случае возвращается unmodifiable представление и при изменении исходной коллекции
 * эти изменения повлияют и на представление
 */
public class Test {
    public static void main(String[] args) {
        // =============== BEFORE JAVA 9 ================
        // LIST
        ArrayList<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("3");
        List<String> unmodifiableList = Collections.unmodifiableList(list);
        // check unmodifiable
        // [1, 2, 3]
        System.out.println(unmodifiableList);
        list.add("4");
        // [1, 2, 3, 4]
        System.out.println(unmodifiableList);

        // SET
        HashSet<String> set = new HashSet<>();
        set.add("1");
        set.add("2");
        set.add("3");
        Set<String> unmodifiableSet = Collections.unmodifiableSet(set);

        // MAP
        HashMap<String, Integer> map = new HashMap<>();
        map.put("1", 1);
        map.put("2", 2);
        map.put("3", 3);
        Map<String, Integer> unmodifiableMap = Collections.unmodifiableMap(map);


        // =============== AFTER JAVA 9 ================
        // LIST
        unmodifiableList = List.of("1", "2", "3");

        // SET
        unmodifiableSet = Set.of("1", "2", "3");

        // MAP
        unmodifiableMap = Map.of(
                "1", 1,
                "2", 2,
                "3", 3);
        unmodifiableMap = Map.ofEntries(
                Map.entry("1", 1),
                Map.entry("2", 2),
                Map.entry("3", 3));
    }
}
