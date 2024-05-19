package com.github.ilebedenko.release_history.java9._4_interface_private_method;

/**
 * Приватные методы позволяют решить проблему переиспользования кода
 * в default и static методах интерфейса
 */
public class Test {
    public static void main(String[] args) {
        Logger logger = new Logger() {};
        logger.debug("Сообщение для отладки");
        logger.info("Информационное сообщение");
        logger.warn("Сообщение с предупреждением");
        logger.error("Сообщение об ошибке");

        Logger.systemLog();
    }
}
