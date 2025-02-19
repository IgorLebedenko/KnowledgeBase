package com.github.ilebedenko.release_history.java10._2_copying_to_immutable_collections;

import java.util.*;

/**
 * Добавлены статичные методы `copyOf()` для всех видов коллекций.
 * Это позволяет создавать Immutable коллекцию из обычной,
 * при этом изменение исходной коллекции никак не повлияет на скопированную.
 */
public class Test {
    public static void main(String[] args) {
        // LIST
        ArrayList<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("3");
        List<String> immutableList = List.copyOf(list);
        System.out.println(immutableList);
        // check unmodifiable
        list.add("4");
        System.out.println(immutableList);

        // SET
        HashSet<String> set = new HashSet<>();
        set.add("1");
        set.add("2");
        set.add("3");
        Set<String> immutableSet = Set.copyOf(set);
        System.out.println(immutableSet);
        // check unmodifiable
        set.add("4");
        System.out.println(immutableSet);

        // MAP
        HashMap<String, Integer> map = new HashMap<>();
        map.put("1", 1);
        map.put("2", 2);
        map.put("3", 3);
        System.out.println(map);
        // check unmodifiable
        map.put("4", 4);
        System.out.println(map);
    }
}
