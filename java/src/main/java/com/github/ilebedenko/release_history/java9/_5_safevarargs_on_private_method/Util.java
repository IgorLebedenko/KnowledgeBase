package com.github.ilebedenko.release_history.java9._5_safevarargs_on_private_method;

import java.util.Arrays;

public class Util {

    @SafeVarargs
    public final <T> void displayFinal(T... names) {
        displayPrivate(names);
    }

    @SafeVarargs
    public static <T> void displayStatic(T... names) {
        System.out.println(Arrays.toString(names));
    }

    @SafeVarargs
    private <T> void displayPrivate(T... names) {
        System.out.println(Arrays.toString(names));
    }
}
