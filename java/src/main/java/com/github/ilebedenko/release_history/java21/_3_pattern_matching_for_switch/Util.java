package com.github.ilebedenko.release_history.java21._3_pattern_matching_for_switch;

import java.util.Random;

public class Util {

    private static final Random random = new Random();

    public static Object randomTypeObject() {
        return switch (random.nextInt(3)) {
            case 0 -> "String";
            case 1 -> 1;
            case 2 -> true;
            default -> new Object();
        };
    }

    public static Integer randomIntObject() {
        return switch (random.nextInt(3)) {
            case 0 -> -1;
            case 1 -> 0;
            case 2 -> 1;
            default -> throw new IllegalStateException("Unexpected value");
        };
    }

    public static Object randomTypeObjectWithNull() {
        return switch (random.nextInt(2)) {
            case 0 -> "String";
            case 1 -> 1;
            default -> null;
        };
    }

    public static String randomString() {
        return switch (random.nextInt(2)) {
            case 0 -> "Foo";
            case 1 -> "Bar";
            default -> null;
        };
    }
}
