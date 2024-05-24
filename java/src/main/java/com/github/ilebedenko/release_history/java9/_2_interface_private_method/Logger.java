package com.github.ilebedenko.release_history.java9._2_interface_private_method;

public interface Logger {
    // Дефолтные методы
    default void debug(String msg) {
        log(LogLevel.DEBUG, msg);
    }

    default void info(String msg) {
        log(LogLevel.INFO, msg);
    }

    default void warn(String msg) {
        log(LogLevel.WARN, msg);
    }

    default void error(String msg) {
        log(LogLevel.ERROR, msg);
    }

    // Статичный метод
    static void systemLog() {
        log(LogLevel.SYSTEM, "Системное сообщение");
    }


    private static void log(LogLevel level, String msg) {
        System.out.printf("[%s] %s%n", level.name(), msg);
    }
}
