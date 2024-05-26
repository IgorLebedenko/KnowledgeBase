package com.github.ilebedenko.release_history.java9._8_new_optional_methods;

import java.util.Optional;

public class AddressUtil {

    static Optional<String> getHomeAddress(String name) {
        return Math.random() > 0.5
                ? Optional.of(name + "'s Home")
                : Optional.empty();
    }

    static Optional<String> getWorkAddress(String name) {
        return Math.random() > 0.2
                ? Optional.of(name + "'s Work")
                : Optional.empty();
    }
}
