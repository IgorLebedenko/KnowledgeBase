package com.github.ilebedenko.release_history.java9._3_anonymous_class_diamond_operator;

import java.util.List;

/**
 * Diamond operator <> теперь можно использовать и с анонимными классами
 * для упрощения кода и улучшения читабельности
 */
public class Test {
    public static void main(String[] args) {
        // =============== BEFORE JAVA 9 ================
        Handler<String> stringHandler = new Handler<String>("text") {
            @Override
            void handle() {
                System.out.println(content);
            }
        };

        Handler<? extends Number> numberHandler = new Handler<Number>(1) {
            @Override
            void handle() {
                System.out.println(content);
            }
        };

        Handler<?> anyHandler = new Handler<Object>(List.of("1", "2", "3")) {
            @Override
            void handle() {
                System.out.println(content);
            }
        };

        // =============== AFTER JAVA 9 ================
        Handler<String> stringHandler2 = new Handler<>("text") {
            @Override
            void handle() {
                System.out.println(content);
            }
        };

        Handler<? extends Number> numberHandler2 = new Handler<>(1) {
            @Override
            void handle() {
                System.out.println(content);
            }
        };

        Handler<?> anyHandler2 = new Handler<>(List.of("1", "2", "3")) {
            @Override
            void handle() {
                System.out.println(content);
            }
        };
    }
}
