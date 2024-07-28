package com.github.ilebedenko.release_history.java10._1_local_variable_type_inference;

import java.util.List;

public class Executor {
    <T> List<T> execute(T input) {
        return List.of(input, input, input);
    }
}
